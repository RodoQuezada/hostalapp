package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;
import cl.portafolio.hostalapp.models.repository.IOrdenDeCompraRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/ordendecompra")
public class OrdenDeCompraController {

    private final IOrdenDeCompraRepository ordenDeCompraRepository;


    public OrdenDeCompraController(IOrdenDeCompraRepository ordenDeCompraRepository) {
        this.ordenDeCompraRepository = ordenDeCompraRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<OrdenDeCompra> findAll(){
        return  ordenDeCompraRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrdenDeCompra save(@RequestBody @Valid OrdenDeCompra ordenDeCompra){
        return ordenDeCompraRepository.save(ordenDeCompra);
    }


}
