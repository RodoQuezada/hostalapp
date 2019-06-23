package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Huesped;

import java.util.List;

public interface IHuespedService {

    List<Huesped> findAll();
    Huesped save(Huesped huesped);

}
