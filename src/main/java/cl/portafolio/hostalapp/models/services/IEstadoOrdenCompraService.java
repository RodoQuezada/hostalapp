package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.EstadoOrdenCompra;

public interface IEstadoOrdenCompraService {

    EstadoOrdenCompra save(EstadoOrdenCompra estadoOrdenCompra);
    EstadoOrdenCompra findById(Long id);
    String getEstadoCompra(Long id);

}
