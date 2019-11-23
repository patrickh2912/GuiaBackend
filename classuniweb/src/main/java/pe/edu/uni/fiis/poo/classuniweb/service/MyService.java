package pe.edu.uni.fiis.poo.classuniweb.service;

import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioSign;

public interface MyService {
    UsuarioResponse loginUsuario(UsuarioRequest request);
    UsuarioResponse SingUpUsuario (UsuarioSign request);
    UsuarioResponse removerUsuario(UsuarioRequest request);
//    GenerarUsurio generarIdUsuario();

}
