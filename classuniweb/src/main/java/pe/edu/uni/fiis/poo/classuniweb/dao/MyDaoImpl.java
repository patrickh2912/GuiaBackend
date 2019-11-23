package pe.edu.uni.fiis.poo.classuniweb.dao;

import org.springframework.stereotype.Repository;
import pe.edu.uni.fiis.poo.classuniweb.dao.datasource.MyDatasource;
import pe.edu.uni.fiis.poo.classuniweb.dao.mapper.UsuarioMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;

import java.math.BigDecimal;
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
            ex.printStackTrace();
            return usuario;
        }
        return usuario;
    }
    //******************************************************************************************
    public List<Ambiente> obtenerAmbientes() {
        List<Ambiente> lista = null;
        try{
            List<Map<String, Object>> filas = this.jdbcTemplate.queryForList(

                    " select codAmbiente, codTipoAmbiente, ubicacion, capacidad, tipoPizarra, tipoMesa, proyector, accesoWifi " +
                            "from ambiente ");
            


            lista = new ArrayList<Ambiente>();

            for (Map<String, Object> fila : filas) {
                Ambiente p = new Ambiente();
                p.setCodAmbiente((String)fila.get("codAmbiente"));
                p.setCodTipoAmbiente((String)fila.get("codTipoAmbiente"));
                p.setUbicacion((String)fila.get("ubicacion"));
                p.setCapacidad(((BigDecimal)fila.get("capacidad")).intValue());
                p.setTipoPizarra((String)fila.get("tipoPizarra"));
                p.setTipoMesa((String)fila.get("tipoMesa"));
                p.setProyector((String)fila.get("proyector"));
                p.setAccesoWifi((String)fila.get("accesoWifi"));
                lista.add(p);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return lista;
        }
        return lista;
    }

    //******************************************************************************************

    @Override
    public Usuario registrarUsuario(Usuario request) {
        String sql =    " insert into usuario (idUsuario,\n" +
                "       password,\n" +
                "       codUsuario,\n" +
                "       dni,\n" +
                "       nombreUsuario,\n" +
                "       apellidoUsuario,\n" +
                "       correo,\n" +
                "       condicion,\n" +
                "       tipoUsuario)" +
                "       values( ? , ? , ? ,? ,?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                new String[]{
                        request.getIdUsuario(),request.getPassword(), request.getCodUsuario(), request.getDni(),
                        request.getNombreUsuario(), request.getApellidoUsuario(), request.getCorreo(), request.getCondicion(),
                        request.getTipoUsuario()
                });
        return request;
    }
//U000001
    public Usuario crearUsuarioAutogenerado(Usuario request) {
        String sql = " select 'U'||trim(to_char( " +
                "          to_number(substr(max(cod_usuario),2,7),'9999999')+1" +
                "           ,'0000009')) cod_usuario, " +
                "   null credencial, null nombres, null apellidos, null estado" +
                " from Usuario";
        Usuario usuario = this.jdbcTemplate.queryForObject(sql, new UsuarioMapper());
        request.setIdUsuario(usuario.getIdUsuario());

        return registrarUsuario(request);
    }

    //******************************************************************************************

    /*
    private String idUsuario;
    private String password;
    private String codUsuario; // codigo UNI
    private String dni;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String correo;
    private String condicion;
    private String tipoUsuario;
     */

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

}
