package pe.edu.uni.fiis.poo.classuniweb.service;

import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.AmbienteHorario;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteHorarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioSign;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.*;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoResponse;

import java.util.List;


public interface MyService {
    UsuarioResponse loginUsuario(UsuarioRequest request);
    PedidoResponse HacerPedido(PedidoRequest request);
    List<Ambiente> obtenerAmbientes();//
    List<Ambiente> ObtenterCodAmbiente(AmbienteRequest request);
    List<AmbienteHorario> ObtenerHorarios(AmbienteHorarioRequest request);
    UsuarioResponse registrarUsuario (UsuarioRequest request);
    UsuarioResponse removerUsuario(UsuarioRequest request);
    AmbienteResponse obtenerDatosAmbiente (AmbienteRequest request);

}
