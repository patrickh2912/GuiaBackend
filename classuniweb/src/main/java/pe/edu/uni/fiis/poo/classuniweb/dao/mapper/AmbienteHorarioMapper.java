package pe.edu.uni.fiis.poo.classuniweb.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.AmbienteHorario;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AmbienteHorarioMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        AmbienteHorario response = new AmbienteHorario();
        response.setCodHorario(resultSet.getString("codHorario"));
        response.setCodAmbiente(resultSet.getString("codAmbiente"));
        response.setDia(resultSet.getString("dia"));
        response.setHoraInicio(resultSet.getString("horaInicio"));
        response.setHoraFinal(resultSet.getString("horaFinal"));
        return response;
    }
}
