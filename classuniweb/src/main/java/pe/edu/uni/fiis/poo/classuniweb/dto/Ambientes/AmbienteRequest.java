package pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;

public class AmbienteRequest {
    private String codAmbiente;
    private String codTipoAmbiente;

    public String getCodTipoAmbiente() {
        return codTipoAmbiente;
    }

    public void setCodTipoAmbiente(String codTipoAmbiente) {
        this.codTipoAmbiente = codTipoAmbiente;
    }

    public String getCodAmbiente() {
        return codAmbiente;
    }

    public void setCodAmbiente(String codAmbiente) {
        this.codAmbiente = codAmbiente;
    }
}
