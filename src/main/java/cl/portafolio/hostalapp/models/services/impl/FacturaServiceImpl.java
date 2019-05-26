package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Factura;
import cl.portafolio.hostalapp.models.repository.IFacturaRepository;
import cl.portafolio.hostalapp.models.services.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class FacturaServiceImpl implements IFacturaService {

   @Autowired
   private IFacturaRepository facturaRepository;

    @Override
    public List<Factura> getAll() {
        return (List<Factura>) facturaRepository.findAll();
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
