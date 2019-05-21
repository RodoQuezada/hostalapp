package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.RepresentanteLegal;

import java.util.List;

public interface IRepresentanteLegalService {

    List<RepresentanteLegal> findAll();
    RepresentanteLegal save(RepresentanteLegal representanteLegal);
    RepresentanteLegal findById(Long id);


}
