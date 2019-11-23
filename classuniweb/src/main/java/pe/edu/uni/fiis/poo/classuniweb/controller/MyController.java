package pe.edu.uni.fiis.poo.classuniweb.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.IdUsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.IdUsuarioResponse;
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
            return response;
        }

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
