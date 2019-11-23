package pe.edu.uni.fiis.poo.classuniweb.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteResponse;
=======
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.IdUsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.IdUsuarioResponse;
>>>>>>> d4faa72f4735ceffbb96912fadbd747bf36301d6
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.service.MyService;

@RestController
public class MyController {

        private MyService myService;

        @PostMapping(value = "/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioResponse loginUsuario(@RequestBody UsuarioRequest request){
        UsuarioResponse response = this.myService.loginUsuario(request);
        if(response.getUsuario() == null){
            response.setError("No hay usuario");
        }
<<<<<<< HEAD
        return response;
    }
    @PostMapping(value = "/ambientes",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AmbienteResponse MostrarAmbientes(){
        AmbienteResponse response = new AmbienteResponse();
        response.setLista(this.myService.obtenerAmbientes());
        return response;
    }


=======

    @PostMapping(value = "/compararIdUsuarios",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public IdUsuarioResponse compararUsuarios(@RequestBody IdUsuarioRequest request){
        IdUsuarioResponse response = this.myService.compararUsuarios(request);
        if(response.getUsuario() == null){
            response.setError("usuario permitido");
        }
        return response;
    }

>>>>>>> d4faa72f4735ceffbb96912fadbd747bf36301d6
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
