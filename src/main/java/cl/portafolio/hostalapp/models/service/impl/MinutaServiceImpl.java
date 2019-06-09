package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Minuta;
import cl.portafolio.hostalapp.models.repository.IMinutaRepository;
import cl.portafolio.hostalapp.models.service.IMinutaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinutaServiceImpl implements IMinutaService {

    private final IMinutaRepository minutaRepository;

    public MinutaServiceImpl(IMinutaRepository minutaRepository) {
        this.minutaRepository = minutaRepository;
    }

    @Override
    public List<Minuta> getAll() {
        return minutaRepository.findAll();
    }

    @Override
    public Minuta save(Minuta minuta) {
        return minutaRepository.save(minuta);
    }
}
