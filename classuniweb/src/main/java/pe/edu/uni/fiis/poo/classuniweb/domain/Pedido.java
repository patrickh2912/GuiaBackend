package pe.edu.uni.fiis.poo.classuniweb.domain;

public class Pedido {
    private  String codPedido;
    private  String idUsuario;
    private  String codAmbiente;
    private  String codHorario;
    private  String motivo;
    private String dia;
    private  String fecha;
    private  String codEstado;

    public String getDia() {
        return dia;

    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

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

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }
}
