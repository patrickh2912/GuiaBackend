package pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;

public class AmbienteResponse {
    private Ambiente ambiente;
    private String erro;

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}
