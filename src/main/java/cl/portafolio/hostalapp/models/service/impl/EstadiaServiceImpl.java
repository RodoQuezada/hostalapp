package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Estadia;
import cl.portafolio.hostalapp.models.repository.IEstadiaRepository;
import cl.portafolio.hostalapp.models.service.IEstadiaService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EstadiaServiceImpl implements IEstadiaService {


    private final IEstadiaRepository estadiaRepository;

    public EstadiaServiceImpl(IEstadiaRepository estadiaRepository) {
        this.estadiaRepository = estadiaRepository;
    }

    @Override
    public List<Estadia> findAll() {
        return estadiaRepository.findAll();
    }

    @Override
    public Estadia save(Estadia estadia) {
        return estadiaRepository.save(estadia);
    }

    @Override
    public Estadia findById(Long id) {
        return estadiaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }
}
