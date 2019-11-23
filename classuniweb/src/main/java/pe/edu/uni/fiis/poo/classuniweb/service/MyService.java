package pe.edu.uni.fiis.poo.classuniweb.service;

import pe.edu.uni.fiis.poo.classuniweb.dto.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.UsuarioResponse;

public interface MyService {
    UsuarioResponse loginUsuario(UsuarioRequest request);
    UsuarioResponse removerUsuario(UsuarioRequest request);

}
