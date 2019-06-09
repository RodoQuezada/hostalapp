package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Plato;

import java.util.List;

public interface IPlatoService {

    List<Plato> findAll();
    Plato save(Plato plato);


}
