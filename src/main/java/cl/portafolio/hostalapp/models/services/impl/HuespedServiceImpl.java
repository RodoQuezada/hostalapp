package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Huesped;
import cl.portafolio.hostalapp.models.repository.IHuespedRepository;
import cl.portafolio.hostalapp.models.services.IHuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class HuespedServiceImpl implements IHuespedService {

    @Autowired
    private IHuespedRepository huespedRepository;


    @Override
    public List<Huesped> getAll() {
        return (List<Huesped>) huespedRepository.findAll();
    }

    @Override
    public Huesped save(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    @Override
    public Huesped detele(Long id) {
      Huesped hu = huespedRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
      huespedRepository.delete(hu);
      return hu;
    }

    @Override
    public Huesped findById(Long id) {
        return huespedRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }
}
