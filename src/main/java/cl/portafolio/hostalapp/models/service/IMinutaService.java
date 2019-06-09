package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Minuta;

import java.util.List;

public interface IMinutaService {

    List<Minuta> getAll();
    Minuta save(Minuta minuta);

}
