new Vue({
    el: '#acceso',
    data: {
        username: '',
        pass: '',
        ventana: 'log',
        cod: 'S4-105',
        tipoAmbiente:'',
        ambienteList: null,
        ambienteHorario: null,
        horarioList: null

    },
    methods: {
        login: function () {
            var vm = this;
            var url = 'http://localhost:8080/login';
            var data = {
                "idUsuario": this.username,
                "password": this.pass
            };
                        fetch(url,{
                            method: 'POST',
                            body: JSON.stringify(data),
                            headers:{
                                'Content-Type': 'application/json'
                            }
                        }).then(res => res.json()).catch(error => console.error('Error:', error))
                    .then(response => {
                            console.log(response);
                            if(response.usuario != null){
                                vm.ventana='busqueda';
                            }
                        })
                    .catch(error => console.error('Error:', error))

        },
        traerHorario: function () {
            var vm = this;
            var url = 'https://classuni.getsandbox.com/ambientehorario';
            var data = {
                "codAmbiente": vm.cod
            };
                                  fetch(url, {
                                        method: 'POST',
                                        body: JSON.stringify(data),
                                        headers:{
                                            'Content-Type': 'application/json'
                                        }
                                    }).then(res => res.json())
                                        .catch(error => console.error('Error:', error))
                                        .then(response => {vm.ambiente = response.lista;})
        },
        buscarAmbiente: function () {
            var vm = this;
            var url = 'https://classuni.getsandbox.com/ambientehorario';
            var data = {
                "codAmbiente": vm.tipoAmbiente
            };
            fetch(url, {
                method: 'POST',
                body: JSON.stringify(data),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => {vm.ambienteList = response;})
        },
        buscarHorario: function () {
            var vm = this;
            var url = 'https://classuni.getsandbox.com/ambientehorario';
            var data = {
                "codAmbiente": vm.ambienteHorario
            };
            fetch(url, {
                method: 'POST',
                body: JSON.stringify(data),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => {vm.horarioList = response;})
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
            var url = 'RegistrarUsuario';
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
                        }).then(res => res.json())
                        .catch(error => console.error('Error:', error))
                            .then(response => {
                        vm.confirmacion = 'ingreso correcto';
                        alert(this.confirmacion + " " + this.id + " " + this.clave);
                    })
        }
    }
});
