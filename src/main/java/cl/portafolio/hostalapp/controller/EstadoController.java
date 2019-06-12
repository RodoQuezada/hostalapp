package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.EstadoEstadia;
import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.EstadoOrdenDeCompra;
import cl.portafolio.hostalapp.models.entity.EstadoOrdenDePedido;
import cl.portafolio.hostalapp.models.service.IEstadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estado")
@CrossOrigin(origins = "http://localhost:51653")
public class EstadoController {

    private final IEstadoService estadoService;

    public EstadoController(IEstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping("/estadia")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<EstadoEstadia> findAllEstadoEstadia(){
        return estadoService.findAllEstadoEstadia();
    }

    @GetMapping("/habitacion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<EstadoHabitacion> findAllEstadoHabitacion(){
        return estadoService.findAllEstadoHabitacion();
    }

    @GetMapping("/ordendecompra")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<EstadoOrdenDeCompra> findAllEstadoOrdenDeCompra(){
        return estadoService.findAllEstadoOrdenDeCompra();
    }

    @GetMapping("/ordendepedido")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<EstadoOrdenDePedido> findAllEstadoOrdenDePedido(){
        return estadoService.findAllEstadoOrdenDePedido();
    }


}
