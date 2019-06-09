package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Bodega;

import java.util.List;

public interface IBodegaService {

    List<Bodega> findAll();
    Bodega save(Bodega bodega);
}
