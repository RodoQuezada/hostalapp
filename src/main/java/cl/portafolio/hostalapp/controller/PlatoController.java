package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Plato;
import cl.portafolio.hostalapp.models.service.IPlatoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/plato")
public class PlatoController {

    private final IPlatoService platoService;

    public PlatoController(IPlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Plato> findAll(){
        return platoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Plato save(@RequestBody @Valid Plato plato){
        return platoService.save(plato);
    }


}
