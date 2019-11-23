package pe.edu.uni.fiis.classuni.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uni.fiis.classuni.dto.RequestAmbiente;
import pe.edu.uni.fiis.classuni.dto.ResponseAmbiente;

@RestController
public class MyController {
    @PostMapping(value='/ambiente',
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseAmbiente mostrarAmbienteDisp(@RequestBody RequestAmbiente requestAmbiente){
        ResponseAmbiente responseAmbiente this.

    }
}
