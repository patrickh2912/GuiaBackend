package pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos;

public class PedidoRequest {
    private  String idUsuario;
    private  String codAmbiente;
    private  String codHorario;
    private  String motivo;
    private String dia ;
    private  String fecha;


    public String getDia() { return dia; }

    public void setDia(String dia) { this.dia = dia; }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
