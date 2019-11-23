package pe.edu.uni.fiis.classuni.service;

import jdk.nashorn.internal.ir.RuntimeNode;
import pe.edu.uni.fiis.classuni.dto.RequestAmbiente;
import pe.edu.uni.fiis.classuni.dto.ResponseAmbiente;

public interface MyService {
    ResponseAmbiente mostrarAmbiente(RequestAmbiente requestAmbiente);
}
