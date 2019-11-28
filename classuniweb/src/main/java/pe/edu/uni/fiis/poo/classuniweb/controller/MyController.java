package pe.edu.uni.fiis.poo.classuniweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteHorarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteHorarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoResponse;
import pe.edu.uni.fiis.poo.classuniweb.service.MyService;

@RestController
public class MyController {
        @Autowired
        private MyService myService;


//******************************************************************************************

        @PostMapping(value = "/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioResponse loginUsuario(@RequestBody UsuarioRequest request){
        UsuarioResponse response = this.myService.loginUsuario(request);
        if(response.getUsuario() == null){
            response.setError("No hay usuario");
        }

        return response;
    }


//******************************************************************************************

    @PostMapping(value = "/ambientes",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AmbienteResponse MostrarAmbientes(){
        AmbienteResponse response = new AmbienteResponse();
        response.setLista(this.myService.obtenerAmbientes());
        return response;
    }

//******************************************************************************************

    @PostMapping(value = "/CodAmbientes",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AmbienteResponse ObtenerCodAmbiente( @RequestBody AmbienteRequest request){
        AmbienteResponse response = new AmbienteResponse();
        response.setLista(this.myService.ObtenterCodAmbiente(request));
        return response;
    }


//******************************************************************************************

    @PostMapping(value = "/RegistrarUsuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioResponse registrarUsuario(@RequestBody UsuarioRequest request){
        UsuarioResponse response = this.myService.registrarUsuario(request);
        return response;
    }

    //******************************************************************************************

    @PostMapping(value = "/ambienteHorario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AmbienteHorarioResponse ObtenerHorarios(@RequestBody AmbienteHorarioRequest request){
        AmbienteHorarioResponse response = new AmbienteHorarioResponse();
        response.setLista(this.myService.ObtenerHorarios(request));
        return response;
    }

    //******************************************************************************************

    @PostMapping(value = "/HacerPedido",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PedidoResponse HacerPedido(@RequestBody PedidoRequest request){
        PedidoResponse response = this.myService.HacerPedido(request);
        if(response.getPedido() != null){
            response.setError("No es posible hacer la reserva");
        }
        return response;
    }


/*
         @PostMapping(value = "/sign",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
         public UsuarioResponse SignUsuario(@RequestBody UsuarioSign request){
          UsuarioResponse response = this.myService.SingUpUsuario(request);
         if(response.getUsuario() == null){
            response.setError("No hay usuario");
            }
         return response;
         }
*/
}
