package pe.edu.uni.fiis.poo.classuniweb.domain;

public class Ambiente {
    private String cod_ambiente;
    private String cod_tipo_ambiente;
    private String ubicacion;
    private String tipo_pizarra;
    private String tipo_mesa;
    private boolean wifi;
    private boolean proyector;
    private Integer capasidad;

    public String getCod_ambiente() {
        return cod_ambiente;
    }

    public void setCod_ambiente(String cod_ambiente) {
        this.cod_ambiente = cod_ambiente;
    }

    public String getCod_tipo_ambiente() {
        return cod_tipo_ambiente;
    }

    public void setCod_tipo_ambiente(String cod_tipo_ambiente) {
        this.cod_tipo_ambiente = cod_tipo_ambiente;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_pizarra() {
        return tipo_pizarra;
    }

    public void setTipo_pizarra(String tipo_pizarra) {
        this.tipo_pizarra = tipo_pizarra;
    }

    public String getTipo_mesa() {
        return tipo_mesa;
    }

    public void setTipo_mesa(String tipo_mesa) {
        this.tipo_mesa = tipo_mesa;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isProyector() {
        return proyector;
    }

    public void setProyector(boolean proyector) {
        this.proyector = proyector;
    }

    public Integer getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(Integer capasidad) {
        this.capasidad = capasidad;
    }
}

