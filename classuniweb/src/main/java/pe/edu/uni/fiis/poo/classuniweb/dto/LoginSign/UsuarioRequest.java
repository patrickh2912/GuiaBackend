package pe.edu.uni.fiis.poo.classuniweb.dto.LoginSign;

import pe.edu.uni.fiis.poo.classuniweb.domain.Usuario;

public class UsuarioRequest {
    private String idUsuario;
    private  String password;

    public String getPassword() {
        //codificacion

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
