package cl.portafolio.hostalapp.controller;


import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.services.IHabitacionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/habitacion")
public class HabitacionController {


    final static Logger logger = Logger.getLogger(HabitacionController.class);

    @Autowired
    private IHabitacionService habitacionService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Habitacion> getAll(){
        return habitacionService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion save(@RequestBody Habitacion habitacion){
        System.out.println("controller habitacion ----->" + habitacion.toString());
        logger.info("controller habitacion ----->" + habitacion.toString());
        return habitacionService.save(habitacion);
    }

}
