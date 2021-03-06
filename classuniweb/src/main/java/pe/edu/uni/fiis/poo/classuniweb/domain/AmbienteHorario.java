package pe.edu.uni.fiis.poo.classuniweb.domain;

public class AmbienteHorario {

    private String codHorario;
    private String codAmbiente;
    private String dia;
    private String horaInicio;
    private String horaFinal;

    public String getCodAmbiente() {
        return codAmbiente;
    }

    public void setCodAmbiente(String codAmbiente) {
        this.codAmbiente = codAmbiente;
    }

    public String getCodHorario() {
        return codHorario;
    }

    public void setCodHorario(String codHorario) {
        this.codHorario = codHorario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFin) {
        this.horaFinal = horaFinal;
    }
}
