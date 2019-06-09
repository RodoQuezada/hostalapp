package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Plato;
import cl.portafolio.hostalapp.models.repository.IPlatoRepository;
import cl.portafolio.hostalapp.models.service.IPlatoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoServiceImpl implements IPlatoService {

    private final IPlatoRepository platoRepository;

    public PlatoServiceImpl(IPlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    @Override
    public List<Plato> findAll() {
        return platoRepository.findAll();
    }

    @Override
    public Plato save(Plato plato) {
        return platoRepository.save(plato);
    }
}
