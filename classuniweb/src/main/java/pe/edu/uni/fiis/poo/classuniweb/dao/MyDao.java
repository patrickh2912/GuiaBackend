package pe.edu.uni.fiis.poo.classuniweb.dao;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;

import java.util.List;

public interface MyDao {
    Usuario loginUsuario(Usuario request);
    UsuarioResponse SingUpUsuario (UsuarioRequest request);
    Usuario removerUsuario(Usuario request);
    List<Ambiente> obtenerAmbientes();//    GenerarUsurio generarIdUsuario();
    Usuario registrarUsuario (Usuario request);

}
