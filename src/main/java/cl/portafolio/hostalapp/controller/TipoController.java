package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.entity.TipoPlato;
import cl.portafolio.hostalapp.models.entity.TipoProducto;
import cl.portafolio.hostalapp.models.service.ITipoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipo")
public class TipoController {

    private final ITipoService tipoService;


    public TipoController(ITipoService tipoService) {
        this.tipoService = tipoService;
    }

    @GetMapping("/tipohabitacion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<TipoHabitacion> findAllTipoHabitaciones(){
        return tipoService.findAllHabitaciones();
    }

    @GetMapping("/tipoplato")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<TipoPlato> findAllTipoPlato(){
        return tipoService.findAllPlatos();
    }

    @GetMapping("/tipoproducto")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<TipoProducto> findAllTipoProducto(){
        return tipoService.findAllProductos();
    }

}
