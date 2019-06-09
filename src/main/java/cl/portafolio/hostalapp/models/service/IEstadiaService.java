package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Estadia;

import java.util.List;

public interface IEstadiaService {


    List<Estadia> findAll();
    Estadia save(Estadia estadia);

}
