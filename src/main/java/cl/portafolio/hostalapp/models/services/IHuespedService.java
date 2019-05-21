package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.Huesped;

import java.util.List;

public interface IHuespedService {

    List<Huesped> getAll();
    Huesped save(Huesped huesped);
    Huesped detele(Long id);
    Huesped findById(Long id);

}
