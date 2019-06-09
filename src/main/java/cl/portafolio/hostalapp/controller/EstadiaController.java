package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Estadia;
import cl.portafolio.hostalapp.models.service.IEstadiaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/estadia")
@CrossOrigin(origins = "http://localhost:54239")
public class EstadiaController {

    private final IEstadiaService estadiaService;

    public EstadiaController(IEstadiaService estadiaService) {
        this.estadiaService = estadiaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Estadia> findAll(){
        return estadiaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia save(@RequestBody @Valid Estadia estadia){
        return estadiaService.save(estadia);
    }

}
