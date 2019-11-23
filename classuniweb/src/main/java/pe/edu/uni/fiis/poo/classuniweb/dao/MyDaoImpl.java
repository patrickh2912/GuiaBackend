package pe.edu.uni.fiis.poo.classuniweb.dao;

import org.springframework.stereotype.Repository;
import pe.edu.uni.fiis.poo.classuniweb.dao.datasource.MyDatasource;
import pe.edu.uni.fiis.poo.classuniweb.dao.mapper.UsuarioMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;

@Repository
public class MyDaoImpl extends MyDatasource implements MyDao{


    public Usuario loginUsuario(Usuario request) {
        Usuario usuario = null;
        try{
            usuario = this.jdbcTemplate.queryForObject(
                        " select idUsuario, " +
                            "       password, " +
                            "       codUsuario, " +
                            "       dni, " +
                            "       nombreUsuario, " +
                            "       apellidoUsuario, " +
                            "       correo ," +
                            "    condicion ," +
                            "      tipoUsuario from Usuario " +
                            " where idUsuario = ? " +
                            " and password = ? ", new String[]{request.getIdUsuario(),request.getPassword()
                            }, new UsuarioMapper());


        }catch (Exception ex){
            System.out.println("PATRICK GIL");
            return usuario;
        }
        return usuario;
    }

    @Override
    public Usuario removerUsuario(Usuario request) {
        return null;
    }
}
