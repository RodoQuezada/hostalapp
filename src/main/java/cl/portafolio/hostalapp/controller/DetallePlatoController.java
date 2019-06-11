package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.DetallePlato;
import cl.portafolio.hostalapp.models.service.IDetallePlatoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/detalleplato")
@CrossOrigin(origins = "http://localhost:51653")
public class DetallePlatoController {

    private final IDetallePlatoService detallePlatoService;


    public DetallePlatoController(IDetallePlatoService detallePlatoService) {
        this.detallePlatoService = detallePlatoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<DetallePlato> findAll(){
        return detallePlatoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DetallePlato save(@RequestBody @Valid DetallePlato detallePlato){
        return detallePlatoService.save(detallePlato);
    }

}
