package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Estadia;
import cl.portafolio.hostalapp.models.repository.IEstadiaRepository;
import cl.portafolio.hostalapp.models.services.IEstadiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EstadiaServiceImpl implements IEstadiaService {

    @Autowired
    private IEstadiaRepository estadiaRepository;

    @Override
    public List<Estadia> getAll() {
        System.out.println("-- Estadia Servicio getAll. ");
        return (List<Estadia>) estadiaRepository.findAll();
    }

    @Override
    public Estadia save(Estadia estadia) {
        System.out.println("-- Estadia Servicio save. ");
        return estadiaRepository.save(estadia);
    }

    @Override
    public Estadia findById(Long id) {
        System.out.println("-- Estadia Servicio findById. ");
        return estadiaRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
    }
}
