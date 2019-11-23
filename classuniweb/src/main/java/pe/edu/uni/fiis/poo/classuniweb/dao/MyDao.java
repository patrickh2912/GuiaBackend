package pe.edu.uni.fiis.poo.classuniweb.dao;

import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;

public interface MyDao {
    Usuario loginUsuario(Usuario request);
    Usuario removerUsuario(Usuario request);
}
