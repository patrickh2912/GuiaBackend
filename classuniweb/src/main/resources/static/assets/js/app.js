new Vue({
    el: '#controlador',
    data: {
        nombre: '',
        apellido: '',
        dni: '',
        correo: '',
        id: '',
        codigo_uni: '',
        clave: '',
        tipo: 'Alumno',
        condicion: 'Activo',
        confirmacion: null
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
                "id_usuario": this.id
            };
            fetch(url, {
                method: 'POST',
                body: JSON.stringify(data),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(res = > res.json()
        ).catch(error = > console.error('Error:', error)
        ).then(response = > {
                console.log('Success:', response);
            this.confirmacion = 'ingreso correcto';
            alert(this.confirmacion + " " + this.id + " " + this.clave);
        })
        },
        asignar_id: function () {
            var vm = this;
            var url = 'http://localhost:8080/generarIdUsuario';
            var data = {
                "nombreUsuario": this.nombre,
                "apellidoUsuario": this.apellido,
                "dni": this.dni,
                "correo": this.correo,
                "codUsuario": this.codigo_uni,
                "password": this.clave,
                "tipoUsuario": this.tipo,
                "condicion": this.condicion,
                "id_usuario": this.id
            };
            fetch(url, {
                method: 'POST',
                body: JSON.stringify(data),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(res = > res.json()
        ).catch(error = > console.error('Error:', error)
        ).then(response = > {
                console.log('Success:', response);
            vm.crear();
        })
        }
    }
});

new Vue({
    el:'#acceso',
    data :{
        username:'',
        pass:'',
        ventana:'log_in'
    },
    methods:{
        login :function () {
            var vm =this;
            var url ='http://localhost:8080/login';
            var data ={
                "id_usuario":this.username,
                "password":this.pass
            };
            fetch(url,{
                method: 'POST',
                body: JSON.stringify(data),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => {
                console.log('Success:', response);
                this.ventana='home';
        })
        }
    }
})
