

new Vue({
    el:'#acceso',
    data :{
        username:'',
        pass:'',
        ventana:'log',
        cod: 'S4-105'
    },
    methods:{
        login :function () {
            var vm =this;
            var url ='http://localhost:8080/login';
            var data ={
                "idUsuario":this.username,
                "password":this.pass
            };
            fetch(url,{
                method: 'POST',
                body: JSON.stringify(data),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(response => {
                console.log('Success:', response);
            vm.ventana='busqueda';
            console.log(this.username + this.pass)
            })
        .catch(error => console.error('Error:', error))

        },
        traerHorario : function () {
            var vm = this;
            var url = 'http://localhost:8080/ambienteHorario';
            var data = {
                "codAmbiente": vm.cod
            };
                        fetch(url, {
                            method: 'POST',
                            body: JSON.stringify(data),
                            headers:{
                                'Content-Type': 'application/json'
                            }
                        }).then(response => {
                            vm.ambiente = response.lista
                    }).catch(error => console.error('Error:', error))
        }
    }
});

new Vue({
    el: '#controlador',
    data: {
        nombre: '',
        apellido: '',
        dni: '',
        correo: '',
        codigo_uni: '',
        clave: '',
        tipo: 'Alumno',
        condicion: 'Activo',
        confirmacion: null,


        cod:'S4-105',
        ambiente:
            [
                {
                    codigo_amb:'',
                    tipo_amb:'',
                    dia_amb:'',
                    hora_i:'',
                    hora_f:''

                }

            ]

    },
    methods: {
        crear: function () {
            var vm = this;
            var url = 'http://localhost:8080/RegistrarUsuario';
            var data = {
                "nombreUsuario": this.nombre,
                "apellidoUsuario": this.apellido,
                "dni": this.dni,
                "correo": this.correo,
                "codUsuario": this.codigo_uni,
                "password": this.clave,
                "tipoUsuario": this.tipo,
                "condicion": this.condicion,
                "idUsuario": null
            };
                        fetch(url, {
                            method: 'POST',
                            body: JSON.stringify(data),
                            headers: {
                                'Content-Type': 'application/json'
                            }
                        }).then(response => {
                        vm.confirmacion = 'ingreso correcto';
                        alert(this.confirmacion + " " + this.id + " " + this.clave);
                    })
        },





    }
});
