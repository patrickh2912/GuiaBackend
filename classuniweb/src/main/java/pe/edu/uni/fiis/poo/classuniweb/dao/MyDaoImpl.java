package pe.edu.uni.fiis.poo.classuniweb.dao;

import org.springframework.stereotype.Repository;
import pe.edu.uni.fiis.poo.classuniweb.dao.datasource.MyDatasource;
import pe.edu.uni.fiis.poo.classuniweb.dao.mapper.UsuarioMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class MyDaoImpl extends MyDatasource implements MyDao{

    //******************************************************************************************
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
            return usuario;
        }
        return usuario;
    }
    //******************************************************************************************
    public List<Ambiente> obtenerAmbientes() {
        List<Ambiente> lista = null;
        try{
            List<Map<String, Object>> filas = this.jdbcTemplate.queryForList(
                    " select cod_producto, nombres, estado " +
                            "from producto " +
                            "where estado = '1' ");
            lista = new ArrayList<Ambiente>();

            for (Map<String, Object> fila : filas) {
                Ambiente p = new Ambiente();
                p.setCodAmbiente((String)fila.get("codAmbiente"));
                p.setCodTipoAmbiente((String)fila.get("codTipoAmbiente"));
                p.setUbicacion((String)fila.get("ubicacion"));
                p.setCapacidad((Integer)fila.get("capacidad"));
                p.setTipoPizarra((String)fila.get("tipoPizarra"));
                p.setTipoMesa((String)fila.get("tipoMesa"));
                p.setProyector((String)fila.get("proyector"));
                p.setAccesoWifi((String)fila.get("accesoWifi"));
                lista.add(p);
            }
        }catch (Exception ex){
            return lista;
        }
        return lista;
    }



    //******************************************************************************************
    @Override
    public UsuarioResponse SingUpUsuario(UsuarioRequest request) {
        return null;
    }
    //******************************************************************************************
    @Override
    public Usuario removerUsuario(Usuario request) {
        return null;
    }
    //******************************************************************************************

    @Override
    public Usuario compararUsuarios(Usuario request) {
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
                            " where idUsuario = ? ", new String[]{request.getIdUsuario()
                    }, new UsuarioMapper());


        }catch (Exception ex){
            return usuario;
        }
        return usuario;
    }

    //******************************************************************************************

}
