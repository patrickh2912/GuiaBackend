package pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;

import java.util.List;

public class AmbienteResponse {

    private String error;
    private List<Ambiente> lista;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Ambiente> getLista() {
        return lista;
    }

    public void setLista(List<Ambiente> lista) {
        this.lista = lista;
    }
}
