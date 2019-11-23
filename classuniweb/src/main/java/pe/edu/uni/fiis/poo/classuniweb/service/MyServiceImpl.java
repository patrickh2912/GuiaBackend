package pe.edu.uni.fiis.poo.classuniweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uni.fiis.poo.classuniweb.dao.MyDao;
import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.UsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.UsuarioResponse;
import pe.edu.uni.fiis.poo.classuniweb.util.DemoUtil;

public class MyServiceImpl implements MyService{

    @Autowired
    private MyDao myDao;


    public UsuarioResponse loginUsuario(UsuarioRequest request) {
        Usuario usuario = this.myDao.loginUsuario(DemoUtil.mapToUsuario(request));
        UsuarioResponse response = new UsuarioResponse();
        response.setUsuario(usuario);
        return response;
    }

    public UsuarioResponse removerUsuario(UsuarioRequest request) {
        return null;
    }
}
