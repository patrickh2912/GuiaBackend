package pe.edu.uni.fiis.poo.classuniweb.util;


import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.IdUsuarioRequest;
import pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign.UsuarioRequest;

public class DemoUtil {

    public static Usuario mapToUsuario(UsuarioRequest request){
        Usuario response = new Usuario();
        response.setIdUsuario(request.getIdUsuario());
        response.setPassword(request.getPassword());
        return response;
    }

    public static Usuario mapToIdUsuario(IdUsuarioRequest request){
        Usuario response = new Usuario();
        response.setIdUsuario(request.getIdUsuario());
        return response;
    }

}
