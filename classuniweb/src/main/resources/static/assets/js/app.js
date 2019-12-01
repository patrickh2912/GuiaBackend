new Vue({
    el: '#acceso',
    data: {
        //////login/////
        username: '',
        pass: '',
        ventana: 'log',

        tipoAmbiente: '',
        ambienteList: null,
        ambienteHorario: null,
        horarioList: null,
        creaCuenta:null,
        /////////sign in////////
        nomUsuario:'',
        apellidoUsuario:'',
        dniUsuario:'',
        correoUsuario:'',
        codUni:'',
        clave:null,
        idUsuario:null,
        tipo:'Estudiante',
        condicionUsuario:null,
        confirmacion:'Ingreso Correcto'
    },
    methods: {
        ///////////////////////////////////////////////////////////////////////////////////////////
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
                            else {
                                alert('id o contraseña incorrecta');
                            }
                        })
                    .catch(error => console.error('Error:', error))

        },
        signin : function(){
            this.ventana='sign_in';
        },
        /*Crearcuenta*////////////////////////////////////////////////////////////////////////////////////
        crear: function(){
            var vm = this;
            var url = 'http://localhost:8080/RegistrarUsuario';
            var data = {
                "nombreUsuario": this.nomUsuario,
                "apellidoUsuario": this.apellidoUsuario,
                "dni": this.dniUsuario,
                "correo": this.correoUsuario,
                "codUsuario": this.codUni,
                "password": this.clave,
                "tipoUsuario": this.tipo,
                "condicion": this.condicionUsuario,
                "idUsuario": this.idUsuario
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
        })
        .catch(error => console.error('Error:', error))

        },

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*primer select*/
        buscarAmbiente: function () {
            var vm = this;
            var url = 'http://localhost:8080/CodAmbientes';
            var data = {
                "codTipoAmbiente": vm.tipoAmbiente
            };
            fetch(url, {
                method: 'POST',
                body: JSON.stringify(data),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(res => res.json()).catch(error => console.error('Error:', error))
        .then(response => {vm.ambienteList = response})
        },
 ////////////////////////////////////////////////////////////////////////////////////////////////////////
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
