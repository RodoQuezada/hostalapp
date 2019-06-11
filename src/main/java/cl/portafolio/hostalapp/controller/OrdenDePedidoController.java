package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.OrdenDePedido;
import cl.portafolio.hostalapp.models.service.IOrdenDePedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/ordendepedido")
@CrossOrigin(origins = "http://localhost:51653")
public class OrdenDePedidoController {

    private final IOrdenDePedidoService ordenDePedidoService;

    public OrdenDePedidoController(IOrdenDePedidoService ordenDePedidoService) {
        this.ordenDePedidoService = ordenDePedidoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<OrdenDePedido> findAll(){
        return ordenDePedidoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrdenDePedido save(@RequestBody @Valid OrdenDePedido ordenDePedido){
        return ordenDePedidoService.save(ordenDePedido);
    }
}
