new Vue({
    el: '#controlador',
    data:{
        nombre:'',
        apellido:'',
        dni:'',
        correo:'',
        id:'',
        codigo_uni :'',
        clave:'',
        confirmacion:null
    },
    methods:{
        crear : function () {
            var vm = this;
            var url = 'http://localhost:8080/RegistrarUsuario';
            var data = {
                "nombreUsuario" : this.nombre,
                "apellidoUsuario": this.apellido,
                "dni": this.dni,
                "correo":this.correo,
                "codUsuario":this.codigo_uni,
                "password":this.clave

            };
            fetch(url, {
                method: 'POST',
                body: JSON.stringify(data),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => {
                console.log('Success:', response);
            this.confirmacion='ingreso correcto';
            alert(this.confirmacion);
        })
        }

    }

});

