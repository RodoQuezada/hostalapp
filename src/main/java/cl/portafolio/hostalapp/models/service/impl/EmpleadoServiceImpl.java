package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Empleado;
import cl.portafolio.hostalapp.models.repository.IEmpleadoRepository;
import cl.portafolio.hostalapp.models.service.IEmpleadoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    private final IEmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
