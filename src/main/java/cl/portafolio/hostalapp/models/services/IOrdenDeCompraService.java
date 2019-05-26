package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;

import java.util.List;

public interface IOrdenDeCompraService {

    List<OrdenDeCompra> getAll();
    OrdenDeCompra save(OrdenDeCompra ordenDeCompra);
    OrdenDeCompra findById(Long id);

}
