package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.DetallePlato;
import cl.portafolio.hostalapp.models.repository.IDetallePlatoRepository;
import cl.portafolio.hostalapp.models.service.IDetallePlatoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePlatoServiceImpl implements IDetallePlatoService {

    private final IDetallePlatoRepository detallePlatoRepository;

    public DetallePlatoServiceImpl(IDetallePlatoRepository detallePlatoRepository) {
        this.detallePlatoRepository = detallePlatoRepository;
    }

    @Override
    public List<DetallePlato> findAll() {
        return detallePlatoRepository.findAll();
    }

    @Override
    public DetallePlato save(DetallePlato detallePlato) {
        return detallePlatoRepository.save(detallePlato);
    }
}
