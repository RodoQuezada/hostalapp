package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.RepresentanteLegal;
import cl.portafolio.hostalapp.models.repository.IRepresentanteLegalRepository;
import cl.portafolio.hostalapp.models.services.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class RepresentanteLegalServiceImpl implements IRepresentanteLegalService {

    @Autowired
    private IRepresentanteLegalRepository representanteLegalRepository;

    @Override
    public List<RepresentanteLegal> findAll() {
        System.out.println("-- RepresentanteLegal ServiceImpl find All");
        return (List<RepresentanteLegal>) representanteLegalRepository.findAll();
    }

    @Override
    public RepresentanteLegal save(RepresentanteLegal representanteLegal) {
        System.out.println("-- RepresentanteLegal ServiceImpl save");
        return representanteLegalRepository.save(representanteLegal);
    }

    @Override
    public RepresentanteLegal findById(Long id) {
        return representanteLegalRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
    }


}
