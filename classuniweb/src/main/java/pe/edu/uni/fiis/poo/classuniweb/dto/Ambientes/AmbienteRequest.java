package pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;

public class AmbienteRequest {
    private String codAmbiente;
    private String codTipoAmbiente;
    private String ubicacion;
    private Integer capacidad;
    private String tipoPizarra;
    private String tipoMesa;
    private String proyector;
    private String accesoWifi;

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoPizarra() {
        return tipoPizarra;
    }

    public void setTipoPizarra(String tipoPizarra) {
        this.tipoPizarra = tipoPizarra;
    }

    public String getTipoMesa() {
        return tipoMesa;
    }

    public void setTipoMesa(String tipoMesa) {
        this.tipoMesa = tipoMesa;
    }

    public String getProyector() {
        return proyector;
    }

    public void setProyector(String proyector) {
        this.proyector = proyector;
    }

    public String getAccesoWifi() {
        return accesoWifi;
    }

    public void setAccesoWifi(String accesoWifi) {
        this.accesoWifi = accesoWifi;
    }
}
