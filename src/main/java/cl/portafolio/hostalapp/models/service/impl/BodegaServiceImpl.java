package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Bodega;
import cl.portafolio.hostalapp.models.repository.IBodegaRepository;
import cl.portafolio.hostalapp.models.service.IBodegaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodegaServiceImpl implements IBodegaService {

    private final IBodegaRepository bodegaRepository;

    public BodegaServiceImpl(IBodegaRepository bodegaRepository) {
        this.bodegaRepository = bodegaRepository;
    }

    @Override
    public List<Bodega> findAll() {
        return bodegaRepository.findAll();
    }

    @Override
    public Bodega save(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }
}
