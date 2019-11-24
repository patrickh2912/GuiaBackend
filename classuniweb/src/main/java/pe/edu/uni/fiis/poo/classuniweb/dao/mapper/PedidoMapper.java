package pe.edu.uni.fiis.poo.classuniweb.dao.mapper;

import org.apache.tomcat.util.net.jsse.PEMFile;
import org.springframework.jdbc.core.RowMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Pedido;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PedidoMapper implements RowMapper<Pedido> {
    @Override
    public Pedido mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Pedido response = new Pedido();
        response.setCodPedido(resultSet.getString("codPedido"));
        response.setIdUsuario(resultSet.getString("idUsuario"));
        response.setCodAmbiente(resultSet.getString("codAmbiente"));
        response.setCodHorario(resultSet.getString("codHorario"));
        response.setFecha(resultSet.getString("fecha"));
        response.setMotivo(resultSet.getString("motivo"));
        response.setCodEstado(resultSet.getString("codEstado"));
        return response;
    }
}
