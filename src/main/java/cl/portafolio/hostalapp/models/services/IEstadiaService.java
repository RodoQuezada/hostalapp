package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.Estadia;

import java.util.List;

public interface IEstadiaService {

    List<Estadia> getAll();

    Estadia save(Estadia estadia);

    Estadia findById(Long id);




}
