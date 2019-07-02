package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Factura;
import cl.portafolio.hostalapp.models.repository.IFacturaRepository;
import cl.portafolio.hostalapp.models.service.IFacturaService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class FacturaServiceImpl implements IFacturaService {

    private final IFacturaRepository facturaRepository;

    public FacturaServiceImpl(IFacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }


    @Override
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Factura findById(Long id) {
        return facturaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }
}
