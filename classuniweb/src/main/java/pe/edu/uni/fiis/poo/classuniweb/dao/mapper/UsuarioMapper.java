package pe.edu.uni.fiis.poo.classuniweb.dao.mapper;


import org.springframework.jdbc.core.RowMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;


import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapper  implements RowMapper<Usuario> {
    @Override
    public Usuario mapRow(ResultSet resultSet, int i) throws SQLException {
        Usuario response = new Usuario();
        response.setIdUsuario(resultSet.getString("idUsuario"));
        response.setPassword(resultSet.getString("password"));
        response.setDni(resultSet.getString("dni"));
        response.setNombreUsuario(resultSet.getString("nombreUsuario"));
        response.setApellidoUsuario(resultSet.getString("apellidoUsuario"));
        response.setCorreo(resultSet.getString("correo"));
        response.setCondicion(resultSet.getString("condicion"));
        response.setTipoUsuario(resultSet.getString("tipoUsuario"));
        response.setCodUsuario(resultSet.getString("codUsuario"));
        return response;
    }
}
