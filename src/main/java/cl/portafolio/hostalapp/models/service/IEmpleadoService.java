package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {

    List<Empleado> findAll();
    Empleado save(Empleado empleado);

}
