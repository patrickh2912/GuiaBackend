package pe.edu.uni.fiis.poo.classuniweb.service;

<<<<<<< HEAD
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioSign;
=======
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.*;
>>>>>>> d4faa72f4735ceffbb96912fadbd747bf36301d6

import java.util.List;

public interface MyService {
    UsuarioResponse loginUsuario(UsuarioRequest request);
    UsuarioResponse SingUpUsuario (UsuarioSign request);
    UsuarioResponse removerUsuario(UsuarioRequest request);
<<<<<<< HEAD
    List<Ambiente> obtenerAmbientes();//    GenerarUsurio generarIdUsuario();
=======
//    GenerarUsurio generarIdUsuario();
    IdUsuarioResponse compararUsuarios (IdUsuarioRequest request);
>>>>>>> d4faa72f4735ceffbb96912fadbd747bf36301d6

}
