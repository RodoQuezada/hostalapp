package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.repository.IEstadoHabitacionRepository;
import cl.portafolio.hostalapp.models.service.IHabitacionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/habitacion")
@CrossOrigin(origins = "http://localhost:51653")
public class HabitacionController {

    private final IHabitacionService habitacionService;

    public HabitacionController(IHabitacionService habitacionService) {
        this.habitacionService = habitacionService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Habitacion> findAll(){
        return habitacionService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Habitacion findById(@PathVariable(value = "id")Long id){
        return habitacionService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion save(@RequestBody @Valid Habitacion habitacion){
        return habitacionService.save(habitacion);
    }


    @PutMapping("/disponible/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion estadoDisponible(@PathVariable(value = "id") Long id) {
        Habitacion nuevoHabi = habitacionService.findById(id);
        EstadoHabitacion asignado = habitacionService.findByIdEstadoHabitacion(1l);
        nuevoHabi.setEstadoHabitacion(asignado);
        habitacionService.save(nuevoHabi);
        return nuevoHabi;
    }


    @PutMapping("/asignada/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion estadoAsignado(@PathVariable(value = "id") Long id) {
        Habitacion nuevoHabi = habitacionService.findById(id);
        EstadoHabitacion asignado = habitacionService.findByIdEstadoHabitacion(2l);
        nuevoHabi.setEstadoHabitacion(asignado);
        habitacionService.save(nuevoHabi);
        return nuevoHabi;
    }


    @PutMapping("/mantencion/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion estadoMantencion(@PathVariable(value = "id") Long id) {
        Habitacion nuevoHabi = habitacionService.findById(id);
        EstadoHabitacion asignado = habitacionService.findByIdEstadoHabitacion(3l);
        nuevoHabi.setEstadoHabitacion(asignado);
        habitacionService.save(nuevoHabi);
        return nuevoHabi;
    }




}
