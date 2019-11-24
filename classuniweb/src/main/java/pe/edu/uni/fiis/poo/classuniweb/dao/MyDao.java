package pe.edu.uni.fiis.poo.classuniweb.dao;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.AmbienteHorario;
import pe.edu.uni.fiis.poo.classuniweb.domain.Pedido;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteHorarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoRequest;

import java.util.List;

public interface MyDao {
    Usuario loginUsuario(Usuario request);
    List<Ambiente> obtenerAmbientes();//    GenerarUsurio generarIdUsuario();
    Usuario registrarUsuario (Usuario request);
    List<Ambiente> ObtenterCodAmbiente(AmbienteRequest request);
    List<AmbienteHorario> ObtenerHorarios(AmbienteHorarioRequest request);
    Pedido HacerPedido(Pedido request);
    UsuarioResponse SingUpUsuario (UsuarioRequest request);
    Usuario removerUsuario(Usuario request);

}
