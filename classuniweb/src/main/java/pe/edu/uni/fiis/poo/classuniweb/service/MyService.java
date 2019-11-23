package pe.edu.uni.fiis.poo.classuniweb.service;

import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.*;

public interface MyService {
    UsuarioResponse loginUsuario(UsuarioRequest request);
    UsuarioResponse SingUpUsuario (UsuarioSign request);
    UsuarioResponse removerUsuario(UsuarioRequest request);
//    GenerarUsurio generarIdUsuario();
    IdUsuarioResponse compararUsuarios (IdUsuarioRequest request);

}
