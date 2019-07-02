package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Estadia;
import cl.portafolio.hostalapp.models.entity.EstadoEstadia;
import cl.portafolio.hostalapp.models.entity.EstadoOrdenDeCompra;
import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;
import cl.portafolio.hostalapp.models.repository.IOrdenDeCompraRepository;
import cl.portafolio.hostalapp.models.service.IEstadiaService;
import cl.portafolio.hostalapp.models.service.IEstadoService;
import cl.portafolio.hostalapp.models.service.IOrdenDeCompraService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/ordendecompra")
@CrossOrigin(origins = "http://localhost:51653")
public class OrdenDeCompraController {

    private final IOrdenDeCompraService ordenDeCompraService;
    private final IEstadoService estadoService;
    private final IEstadiaService estadiaService;


    public OrdenDeCompraController(IOrdenDeCompraService ordenDeCompraService, IEstadoService estadoService, IEstadiaService estadiaService) {
        this.ordenDeCompraService = ordenDeCompraService;
        this.estadoService = estadoService;
        this.estadiaService = estadiaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<OrdenDeCompra> findAll(){
        return  ordenDeCompraService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrdenDeCompra save(@RequestBody @Valid OrdenDeCompra ordenDeCompra){
        EstadoEstadia finalizada = estadoService.findByIdEstadoEstadia(4l);

        Estadia estadiaNueva = estadiaService.findById(ordenDeCompra.getEstadia().getId());
        estadiaNueva.setEstadoEstadia(finalizada);
        estadiaService.save(estadiaNueva);
        ordenDeCompra.setEstadia(estadiaNueva);

       // ordenDeCompra.getEstadia().setEstadoEstadia(finalizada);
        return ordenDeCompraService.save(ordenDeCompra);
    }

    @PutMapping("/actualizar")
    @ResponseStatus(HttpStatus.CREATED)
    public OrdenDeCompra actualizar(@RequestBody @Valid OrdenDeCompra ordenDeCompra){

        EstadoOrdenDeCompra terminada = estadoService.findByIdEstadoOrdenDeCompra(2l);
        ordenDeCompra.setEstadoOrdenDeCompra(terminada);

        return ordenDeCompraService.save(ordenDeCompra);
    }


    /*
    @GetMapping("/load")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<OrdenDeCompra> load(){
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();

        Estadia estadia = new Estadia();



        ordenDeCompra.setEstadia();
        ordenDeCompra.setEstadoOrdenDeCompra();
        ordenDeCompra.setFactura();
        ordenDeCompra.setTotalConsumido(32000);
        ordenDeCompra.setTotalEstadia(100000);
        return  ordenDeCompraRepository.findAll();
    } */


}
