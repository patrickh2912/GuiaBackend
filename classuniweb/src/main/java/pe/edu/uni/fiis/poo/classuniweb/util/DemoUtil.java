package pe.edu.uni.fiis.poo.classuniweb.util;


import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;
import pe.edu.uni.fiis.poo.classuniweb.dto.UsuarioRequest;

public class DemoUtil {

    public static Usuario mapToUsuario(UsuarioRequest request){
        Usuario response = new Usuario();
        response.setIdUsuario(request.getIdUsuario());
        response.setPassword(request.getPassword());
        return response;
    }

}
