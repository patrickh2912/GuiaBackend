new Vue({
    el:'#busca',
    data:{
        cod:'S4-105',
        ambiente:
            [
                {
                    codigo:'',
                    tipo:'',
                    dia:'',
                    hora_i:'',
                    hora_f:''

                }

            ]

    },
    methods:{
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
            }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => {
                console.log('Success:', response);
                console.log(vm.cod),
            vm.ambiente = response.lista
        })
        }
    }
});