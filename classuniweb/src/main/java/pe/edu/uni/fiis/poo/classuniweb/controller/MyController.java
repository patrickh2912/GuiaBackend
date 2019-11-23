package pe.edu.uni.fiis.poo.classuniweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uni.fiis.poo.classuniweb.dto.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.service.MyService;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @PostMapping(value = "/usuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioResponse loginUsuario(@RequestBody UsuarioRequest request){
        UsuarioResponse response = this.myService.loginUsuario(request);
        if(response.getUsuario() == null){
            response.setError("No hay usuario");
        }
        return response;
    }
}
