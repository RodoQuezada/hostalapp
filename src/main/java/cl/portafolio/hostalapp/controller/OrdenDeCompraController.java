package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Estadia;
import cl.portafolio.hostalapp.models.entity.EstadoEstadia;
import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;
import cl.portafolio.hostalapp.models.repository.IOrdenDeCompraRepository;
import cl.portafolio.hostalapp.models.service.IEstadiaService;
import cl.portafolio.hostalapp.models.service.IEstadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/ordendecompra")
@CrossOrigin(origins = "http://localhost:51653")
public class OrdenDeCompraController {

    private final IOrdenDeCompraRepository ordenDeCompraRepository;
    private final IEstadoService estadoService;
    private final IEstadiaService estadiaService;


    public OrdenDeCompraController(IOrdenDeCompraRepository ordenDeCompraRepository, IEstadoService estadoService, IEstadiaService estadiaService) {
        this.ordenDeCompraRepository = ordenDeCompraRepository;
        this.estadoService = estadoService;
        this.estadiaService = estadiaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<OrdenDeCompra> findAll(){
        return  ordenDeCompraRepository.findAll();
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
        return ordenDeCompraRepository.save(ordenDeCompra);
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
