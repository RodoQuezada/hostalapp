package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> findAll();
    Producto save(Producto producto);
}
