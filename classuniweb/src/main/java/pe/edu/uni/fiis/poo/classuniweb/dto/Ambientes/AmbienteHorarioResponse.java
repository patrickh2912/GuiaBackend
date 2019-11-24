package pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.AmbienteHorario;

import java.util.List;

public class AmbienteHorarioResponse {
    private String error;
    private List<AmbienteHorario> lista;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<AmbienteHorario> getLista() {
        return lista;
    }

    public void setLista(List<AmbienteHorario> lista) {
        this.lista = lista;
    }
}
