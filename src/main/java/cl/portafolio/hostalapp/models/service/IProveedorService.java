package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Proveedor;

import java.util.List;

public interface IProveedorService {

    List<Proveedor> getAll();
    Proveedor save(Proveedor proveedor);
}
