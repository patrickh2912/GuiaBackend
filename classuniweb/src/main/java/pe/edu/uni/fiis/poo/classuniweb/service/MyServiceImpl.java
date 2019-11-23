package pe.edu.uni.fiis.poo.classuniweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.fiis.poo.classuniweb.dao.MyDao;
import pe.edu.uni.fiis.poo.classuniweb.domain.Ambiente;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.*;
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

    /*
        @Override
        public UsuarioResponse SingUpUsuario(UsuarioSign request) {
            Usuario usuario = this.myDao.loginUsuario(DemoUtil.mapToUsuario(request));
            UsuarioResponse response = new UsuarioResponse();
            response.setUsuario(usuario);
            return response;
        }
    */


//******************************************************************************************
    public UsuarioResponse removerUsuario(UsuarioRequest request) {
        return null;
    }

//******************************************************************************************
    public List<Ambiente> obtenerAmbientes() {
        return this.myDao.obtenerAmbientes();
    }
    //******************************************************************************************

    @Override
    public UsuarioResponse registrarUsuario (UsuarioRequest request) {
        return null;
    }
}
