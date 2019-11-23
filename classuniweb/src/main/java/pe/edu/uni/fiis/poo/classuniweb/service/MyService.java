package pe.edu.uni.fiis.poo.classuniweb.service;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioSign;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.*;

import java.util.List;

public interface MyService {
    UsuarioResponse loginUsuario(UsuarioRequest request);
    UsuarioResponse SingUpUsuario (UsuarioSign request);
    UsuarioResponse removerUsuario(UsuarioRequest request);
    List<Ambiente> obtenerAmbientes();//    GenerarUsurio generarIdUsuario();
//    GenerarUsurio generarIdUsuario();
    UsuarioResponse registrarUsuario (UsuarioRequest request);


}
