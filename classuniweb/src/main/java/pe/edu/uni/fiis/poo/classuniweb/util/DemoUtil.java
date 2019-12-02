package pe.edu.uni.fiis.poo.classuniweb.util;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.Pedido;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
//import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.IdUsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoRequest;

public class DemoUtil {

    public static Usuario mapToUsuario(UsuarioRequest request){
        Usuario response = new Usuario();
        response.setIdUsuario(request.getIdUsuario());
        response.setCodUsuario(request.getCodUsuario());
        response.setPassword(request.getPassword());
        response.setDni(request.getDni());
        response.setNombreUsuario(request.getNombreUsuario());
        response.setApellidoUsuario(request.getApellidoUsuario());
        response.setCorreo(request.getCorreo());
        response.setTipoUsuario(request.getTipoUsuario());
        response.setCondicion(request.getCondicion());
        return response;
    }

    public static Pedido mapToPedido(PedidoRequest request){
        Pedido response = new Pedido();
        response.setCodHorario(request.getCodHorario());
        response.setFecha(request.getFecha());
        response.setCodAmbiente(request.getCodAmbiente());
        response.setDia(request.getDia());
        response.setMotivo(request.getMotivo());
        response.setIdUsuario(request.getIdUsuario());
        return response;
    }

    public static Ambiente mapToAmbiente (AmbienteRequest request){
        Ambiente response = new Ambiente();
        response.setAccesoWifi(request.getAccesoWifi());
        response.setCapacidad(request.getCapacidad());
        response.setCodAmbiente(request.getCodAmbiente());
        response.setCodTipoAmbiente(request.getCodTipoAmbiente());
        response.setProyector(request.getProyector());
        response.setTipoMesa(request.getTipoMesa());
        response.setTipoPizarra(request.getTipoPizarra());
        response.setUbicacion(request.getUbicacion());
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
