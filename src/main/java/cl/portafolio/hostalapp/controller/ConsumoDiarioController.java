package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.ConsumoDiario;
import cl.portafolio.hostalapp.models.service.IConsumoDiarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/consumodiario")
@CrossOrigin(origins = "http://localhost:54239")
public class ConsumoDiarioController {

        private final IConsumoDiarioService consumoDiarioService;


    public ConsumoDiarioController(IConsumoDiarioService consumoDiarioService) {
        this.consumoDiarioService = consumoDiarioService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<ConsumoDiario> findAll(){
        return consumoDiarioService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsumoDiario save(@RequestBody @Valid ConsumoDiario consumoDiario){
        return consumoDiarioService.save(consumoDiario);
    }


}
