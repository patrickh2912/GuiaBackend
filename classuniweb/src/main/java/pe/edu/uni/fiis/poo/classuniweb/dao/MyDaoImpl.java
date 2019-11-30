package pe.edu.uni.fiis.poo.classuniweb.dao;

import org.springframework.stereotype.Repository;
import pe.edu.uni.fiis.poo.classuniweb.dao.datasource.MyDatasource;
import pe.edu.uni.fiis.poo.classuniweb.dao.mapper.AmbienteHorarioMapper;
import pe.edu.uni.fiis.poo.classuniweb.dao.mapper.AmbienteMapper;
import pe.edu.uni.fiis.poo.classuniweb.dao.mapper.PedidoMapper;
import pe.edu.uni.fiis.poo.classuniweb.dao.mapper.UsuarioMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.AmbienteHorario;
import pe.edu.uni.fiis.poo.classuniweb.domain.Pedido;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteHorarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoRequest;

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
                    " and password = ? ",
                    new String[]{
                            request.getIdUsuario(),
                            request.encriptarPassword()
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

                    " select codAmbiente, codTipoAmbiente, ubicacion, capacidad, tipoPizarra, tipoMesa, proyector, accesoWifi from ambiente ");

            lista = new ArrayList<>();

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
    public Usuario generarIdUsuario(Usuario request) {
        String sql = " select 'U'||trim(to_char( " +
                "          to_number(substr(max(cod_usuario),2,7),'9999999')+1" +
                "           ,'0000009')) idUsuario, " +
                " null codUsuario, null password, null dni, null nombreUsuario, null apellidoUsuario, null correo, null tipoUsuario, null condicion, null usuarioCreacion" +
                " from usuario";
        Usuario usuario = this.jdbcTemplate.queryForObject(sql, new UsuarioMapper());
        request.setIdUsuario(usuario.getIdUsuario());

        return request;
    }

    @Override
    public Usuario registrarUsuario(Usuario request) {

        request = generarIdUsuario(request);

        String sql = "insert into persona (idUsuario, \n" +
                " codUsuario,\n" +
                " dni,\n" +
                " nombreUsuario,\n " +
                " apellidoUsuario,\n" +
                " correo,\n" +
                " tipoUsuario,\n" +
                " condicion,\n" +
                " password,\n " +
                " usuarioCreacion,\n " +
                " fechaCreacion)" +
                "values(?, ?, ?, ?, ?, ?, ?, ?, ?, USER, CURRENT_TIMESTAMP)";
        this.jdbcTemplate.update(sql,
                new String[]{
                        request.getIdUsuario(),
                        request.getCodUsuario(),
                        request.getDni(),
                        request.getNombreUsuario(),
                        request.getApellidoUsuario(),
                        request.getCorreo(),
                        request.getTipoUsuario(),
                        request.getCondicion(),
                        request.encriptarPassword()
                });
        return request;
    }
    //******************************************************************************************
    @Override
    public List<Ambiente> ObtenterCodAmbiente(AmbienteRequest request) {
        List<Ambiente> lista = null;
        try{
            List<Map<String, Object>> filas = this.jdbcTemplate.queryForList(
                    "select codAmbiente, " +
                            "codTipoAmbiente, " +
                            "ubicacion, " +
                            "capacidad, " +
                            "tipoPizarra, " +
                            "tipoMesa, " +
                            "proyector, " +
                            "accesoWifi from ambiente a where a.codtipoambiente = ? and a.codambiente = ?",request.getCodTipoAmbiente(), request.getCodAmbiente());
                /*,new String[]{ request.getCodTipoAmbiente()}, new AmbienteMapper()*/
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
    public List<AmbienteHorario> ObtenerHorarios(AmbienteHorarioRequest request) {
        List<AmbienteHorario> lista = null;
        try{
            List<Map<String, Object>> filas = this.jdbcTemplate.queryForList(

                    " select  a.codAmbiente, a.codHorario, a.dia, h.horaInicio, h.horaFinal " +
                            " from ambienteHorario a " +
                            " inner join  horario h on a.codHorario = h.codHorario " +
                            " WHERE codAmbiente = ? ", new String[]
                            {request.getCodAmbiente() });


            lista = new ArrayList<AmbienteHorario>();

            for (Map<String, Object> fila : filas) {
                AmbienteHorario p = new AmbienteHorario();
                p.setCodAmbiente((String)fila.get("codAmbiente"));
                p.setCodHorario((String)fila.get("codHorario"));
                p.setDia((String)fila.get("dia"));
                p.setHoraInicio((String)fila.get("horaInicio"));
                p.setHoraFinal((String)fila.get("horaFinal"));
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
    public Pedido HacerPedido(Pedido request) {
        Pedido pedido = null;
        try{
            pedido = this.jdbcTemplate.queryForObject(
                    " select codPedido, " +
                            "       idUsuario, " +
                            "       codAmbiente, " +
                            "       codHorario, " +
                            "       dia, "+
                            "       fecha, " +
                            "       motivo ," +
                            "       estado ," +
                            " from pedido " +
                            " where codHorario = ? " +
                            " and dia = ? " +
                            " and  fecha = ? " +
                            " and codAmbiente = ?", new String[]{request.getCodHorario(),request.getFecha(),request.getCodAmbiente()
                    }, new PedidoMapper());
        }catch (Exception ex){
            ex.printStackTrace();

            String sql1 = " select 'P'||trim(to_char( " +
                    "          to_number(substr(max(codPedido),2,7),'9999999')+1" +
                    "           ,'0000009')) codPedido, " +
                    "  null  idUsuario, null codAmbiente, null codHorario, null fecha" +
                    "  null  motivo, null codEstado " +
                    " from pedido";
            Pedido pedido1 = this.jdbcTemplate.queryForObject(sql1, new PedidoMapper());
            request.setCodPedido(pedido1.getCodPedido());

            String sql =    " insert into pedido (codPedido,\n" +
                    "       idUsuario,\n" +
                    "       codAmbiente,\n" +
                    "       codHorario,\n" +
                    "       fecha,\n" +
                    "       motivo,\n" +
                    "       codEstado,\n" +
                    "       values( ? , ? , ? , ? , ?, ? , 'Confirmado')";
            this.jdbcTemplate.update(sql,
                    new String[]{
                            request.getCodPedido(),request.getCodPedido(), request.getIdUsuario(), request.getCodAmbiente(),
                            request.getCodHorario(), request.getFecha(), request.getMotivo()
                    });
            return null;
        }
        return pedido;
    }

    //******************************************************************************************
    //U000001

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
