package pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos;

import pe.edu.uni.fiis.poo.classuniweb.domain.Pedido;

public class PedidoResponse {
    private Pedido pedido;
    private  String error;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
