package pe.edu.uni.fiis.poo.classuniweb.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;

import javax.swing.plaf.synth.SynthStyle;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AmbienteMapper implements RowMapper<Ambiente> {

    public Ambiente mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Ambiente response = new Ambiente();
        response.setCodAmbiente(resultSet.getString("codAmbiente"));
        response.setCodTipoAmbiente(resultSet.getString("codTipoAmbiente"));
        response.setUbicacion(resultSet.getString("ubicacion"));
        response.setCapacidad(resultSet.getBigDecimal("capacidad").intValue());
        response.setTipoPizarra(resultSet.getString("tipoPizarra"));
        response.setTipoMesa(resultSet.getString("tipoMesa"));
        response.setProyector(resultSet.getString("proyector"));
        response.setAccesoWifi(resultSet.getString("accesoWifi"));
        return response;
    }

}