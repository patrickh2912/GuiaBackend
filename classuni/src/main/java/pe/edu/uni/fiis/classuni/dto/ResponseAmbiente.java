package pe.edu.uni.fiis.classuni.dto;

import pe.edu.uni.fiis.classuni.domain.Ambiente;

public class ResponseAmbiente {
    private Ambiente ambiente;
    private String error;

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
