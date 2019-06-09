package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.DetallePlato;

import java.util.List;

public interface IDetallePlatoService {

    List<DetallePlato> findAll();
    DetallePlato save(DetallePlato detallePlato);

}
