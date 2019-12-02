package pe.edu.uni.fiis.poo.classuniweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.fiis.poo.classuniweb.dao.MyDao;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.AmbienteHorario;
import pe.edu.uni.fiis.poo.classuniweb.domain.Pedido;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteHorarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Ambientes.AmbienteResponse;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.*;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.Pedidos.PedidoResponse;
import pe.edu.uni.fiis.poo.classuniweb.util.DemoUtil;

import java.util.List;

@Service

public class MyServiceImpl implements MyService{
    @Autowired
    private MyDao myDao;

//******************************************************************************************
    public UsuarioResponse loginUsuario(UsuarioRequest request) {
        Usuario usuario = this.myDao.loginUsuario(DemoUtil.mapToUsuario(request));
        UsuarioResponse response = new UsuarioResponse();
        response.setUsuario(usuario);
        return response;
    }
    //******************************************************************************************
    public UsuarioResponse SingUpUsuario(UsuarioSign request) {
        return null;
    }

    //******************************************************************************************
    @Override
    public PedidoResponse HacerPedido(PedidoRequest request) {
        Pedido pedido = this.myDao.HacerPedido(DemoUtil.mapToPedido(request));
        PedidoResponse response = new PedidoResponse();
        response.setPedido(pedido);
        return response;
    }

    //******************************************************************************************
    public List<Ambiente> obtenerAmbientes() {
        return this.myDao.obtenerAmbientes();
    }

    //******************************************************************************************
    @Override
    public List<Ambiente> ObtenterCodAmbiente(AmbienteRequest request) {
        return this.myDao.ObtenterCodAmbiente(request);
    }
    //******************************************************************************************
    @Override
    public List<AmbienteHorario> ObtenerHorarios(AmbienteHorarioRequest request) {
        return this.myDao.ObtenerHorarios(request);
    }
    //******************************************************************************************

    @Override
    public UsuarioResponse registrarUsuario (UsuarioRequest request) {
        Usuario usuario = this.myDao.registrarUsuario(DemoUtil.mapToUsuario(request));
        UsuarioResponse response = new UsuarioResponse();
        response.setUsuario(usuario);
        return response;
    }

    @Override
    public AmbienteResponse obtenerDatosAmbiente(AmbienteRequest request) {
        Ambiente ambiente = this.myDao.obtenerDatosAmbiente(DemoUtil.mapToAmbiente(request));
        AmbienteResponse response = new AmbienteResponse();
        response.setAmbiente(ambiente);
        return response;
    }

    //******************************************************************************************
    public UsuarioResponse removerUsuario(UsuarioRequest request) {
        return null;
    }
}
