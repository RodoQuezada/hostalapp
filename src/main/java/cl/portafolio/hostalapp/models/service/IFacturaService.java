package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Factura;

import java.util.List;

public interface IFacturaService {

    List<Factura> findAll();
    Factura save(Factura factura);

}
