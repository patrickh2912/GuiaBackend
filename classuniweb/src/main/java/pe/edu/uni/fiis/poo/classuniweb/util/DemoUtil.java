package pe.edu.uni.fiis.poo.classuniweb.util;


import pe.edu.uni.fiis.poo.classuniweb.domain.Pedido;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
//import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.IdUsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoRequest;

public class DemoUtil {

    public static Usuario mapToUsuario(UsuarioRequest request){
        Usuario response = new Usuario();
        response.setIdUsuario(request.getIdUsuario());
        response.setPassword(request.getPassword());
        return response;
    }
    public static Pedido mapToPedido(PedidoRequest request){
        Pedido response = new Pedido();
        response.setCodHorario(request.getCodHorario());
        response.setFecha(request.getFecha());
        response.setCodAmbiente(request.getCodAmbiente());
        return response;
    }
/*

    public static Usuario mapToIdUsuario(IdUsuarioRequest request){
        Usuario response = new Usuario();
        response.setIdUsuario(request.getIdUsuario());
        return response;
    }
*/
}
