package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.entity.TipoPlato;
import cl.portafolio.hostalapp.models.entity.TipoProducto;

import java.util.List;

public interface ITipoService {

    List<TipoHabitacion> findAllHabitaciones();
    List<TipoPlato> findAllPlatos();
    List<TipoProducto> findAllProductos();

}
