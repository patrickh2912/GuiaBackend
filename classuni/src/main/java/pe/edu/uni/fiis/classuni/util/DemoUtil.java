package pe.edu.uni.fiis.classuni.util;

import pe.edu.uni.fiis.classuni.domain.Ambiente;
import pe.edu.uni.fiis.classuni.dto.RequestAmbiente;

public class DemoUtil {
    public static Ambiente mapToAmbiente(RequestAmbiente requestAmbiente){
        Ambiente response = new Ambiente();
        response.setCapasidad(requestAmbiente.getCapasidad());
        response.setCod_ambiente(requestAmbiente.getCod_ambiente());
        response.setCod_tipo_ambiente(requestAmbiente.getCod_tipo_ambiente());
        response.setProyector(requestAmbiente.isProyector());
        response.setTipo_mesa(requestAmbiente.getTipo_mesa());
        response.setTipo_pizarra(requestAmbiente.getTipo_pizarra());
        response.setUbicacion(requestAmbiente.getUbicacion());
        response.setWifi(requestAmbiente.isWifi());
        return response;
    }
}
