package pe.edu.uni.fiis.poo.classuniweb.dao;

import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;

public interface MyDao {
    Usuario loginUsuario(Usuario request);
    Usuario compararUsuarios(Usuario request);
    UsuarioResponse SingUpUsuario (UsuarioRequest request);
    Usuario removerUsuario(Usuario request);
}
