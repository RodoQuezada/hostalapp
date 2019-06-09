package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.OrdenDePedido;

import java.util.List;

public interface IOrdenDePedidoService {

    List<OrdenDePedido> findAll();
    OrdenDePedido save(OrdenDePedido ordenDePedido);
}
