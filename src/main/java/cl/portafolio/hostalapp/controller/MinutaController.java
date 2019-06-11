package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Minuta;
import cl.portafolio.hostalapp.models.service.IMinutaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/minuta")
@CrossOrigin(origins = "http://localhost:51653")
public class MinutaController {

    private final IMinutaService minutaService;

    public MinutaController(IMinutaService minutaService) {
        this.minutaService = minutaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Minuta> findAll(){
        return minutaService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Minuta save(@RequestBody @Valid Minuta minuta){
        return minutaService.save(minuta);
    }



}
