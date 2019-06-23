package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Huesped;
import cl.portafolio.hostalapp.models.repository.IHuespedRepository;
import cl.portafolio.hostalapp.models.service.IHuespedService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedServiceImpl implements IHuespedService {

    private final IHuespedRepository huespedRepository;

    public HuespedServiceImpl(IHuespedRepository huespedRepository) {
        this.huespedRepository = huespedRepository;
    }

    @Override
    public List<Huesped> findAll() {
        return huespedRepository.findAll();
    }

    @Override
    public Huesped save(Huesped huesped) {
        return huespedRepository.save(huesped);
    }


}
