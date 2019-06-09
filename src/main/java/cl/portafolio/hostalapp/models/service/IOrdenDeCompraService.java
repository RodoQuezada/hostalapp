package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;

import java.util.List;

public interface IOrdenDeCompraService {

    List<OrdenDeCompra> findAll();
    OrdenDeCompra save(OrdenDeCompra ordenDeCompra);

}
