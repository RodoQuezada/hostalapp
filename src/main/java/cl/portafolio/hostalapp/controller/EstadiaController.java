package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Estadia;
import cl.portafolio.hostalapp.models.entity.EstadoEstadia;
import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.service.IEstadiaService;
import cl.portafolio.hostalapp.models.service.IEstadoService;
import cl.portafolio.hostalapp.models.service.IHabitacionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/estadia")
@CrossOrigin(origins = "http://localhost:51653")
public class EstadiaController {

    private final IEstadiaService estadiaService;
    private final IHabitacionService habitacionService;
    private final IEstadoService estadoService;

    public EstadiaController(IEstadiaService estadiaService, IHabitacionService habitacionService, IEstadoService estadoService) {
        this.estadiaService = estadiaService;
        this.habitacionService = habitacionService;
        this.estadoService = estadoService;
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


    @PutMapping("/checkin")
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia checkin(@PathVariable(value = "id")Long id){
        Estadia nuevaEsta = estadiaService.findById(id);
    //    EstadoHabitacion asignado = habitacionService.findByIdEstadoHabitacion(1l);
        EstadoEstadia iniciada = estadoService.findByIdEstadoEstadia(2l);
        nuevaEsta.setEstadoEstadia(iniciada);
        return nuevaEsta;
    }

    @PutMapping("/checkout")
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia checkout(@PathVariable(value = "id")Long id){
        Estadia nuevaEsta = estadiaService.findById(id);
        //    EstadoHabitacion asignado = habitacionService.findByIdEstadoHabitacion(1l);
        EstadoEstadia calculo = estadoService.findByIdEstadoEstadia(3l);
        nuevaEsta.setEstadoEstadia(calculo);
        return nuevaEsta;
    }




}
