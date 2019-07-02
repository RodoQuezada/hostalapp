package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.EstadoEstadia;
import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.EstadoOrdenDeCompra;
import cl.portafolio.hostalapp.models.entity.EstadoOrdenDePedido;

import java.util.List;

public interface IEstadoService {

    List<EstadoHabitacion> findAllEstadoHabitacion();
    List<EstadoEstadia> findAllEstadoEstadia();
    List<EstadoOrdenDeCompra> findAllEstadoOrdenDeCompra();
    List<EstadoOrdenDePedido> findAllEstadoOrdenDePedido();

    EstadoEstadia findByIdEstadoEstadia(Long id);
    EstadoHabitacion findByIdEstadoHabitacion (Long id);
    EstadoOrdenDeCompra findByIdEstadoOrdenDeCompra(Long id);

}
