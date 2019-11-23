package pe.edu.uni.fiis.poo.classuniweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
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

    @PostMapping(value = "/RegistrarUsuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioResponse crearUsuario(@RequestBody UsuarioRequest request){
        UsuarioResponse response = this.myService.registrarUsuario(request);
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
