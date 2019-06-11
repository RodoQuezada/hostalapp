package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Producto;
import cl.portafolio.hostalapp.models.service.IProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "http://localhost:51653")
public class ProductoController {

    private final IProductoService productoService;

    public ProductoController(IProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Producto> findAll(){
        return productoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Producto save(@RequestBody @Valid Producto producto){
        return productoService.save(producto);
    }
}
