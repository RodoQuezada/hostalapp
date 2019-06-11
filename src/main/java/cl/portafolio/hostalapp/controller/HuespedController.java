package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Huesped;
import cl.portafolio.hostalapp.models.service.IHuespedService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/huesped")
@CrossOrigin(origins = "http://localhost:51653")
public class HuespedController {


    private final IHuespedService huespedService;

    public HuespedController(IHuespedService huespedService) {
        this.huespedService = huespedService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Huesped> findAll(){
        return huespedService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Huesped save(@RequestBody @Valid Huesped huesped){
        return huespedService.save(huesped);
    }



}
