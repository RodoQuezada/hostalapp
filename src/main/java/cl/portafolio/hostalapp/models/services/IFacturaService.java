package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.Factura;

import java.util.List;

public interface IFacturaService {

    List<Factura> getAll();
    Factura save(Factura factura);




}
