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
import java.util.Date;
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
        estadia.setFechaReserva(new Date());
        System.out.println("-- fecha reserva : "+ estadia.getFechaReserva());
        return estadiaService.save(estadia);
    }

/*
    @PutMapping("/checkin/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia checkin(@PathVariable(value = "id")Long id){
        Estadia nuevaEsta = estadiaService.findById(id);
        EstadoHabitacion asignada = estadoService.findByIdEstadoHabitacion(2l);
        EstadoEstadia iniciada = estadoService.findByIdEstadoEstadia(2l);
        nuevaEsta.setEstadoEstadia(iniciada);
        nuevaEsta.getHabitacion().setEstadoHabitacion(asignada);
        estadiaService.save(nuevaEsta);
        return nuevaEsta;
    }

    @PutMapping("/checkout/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia checkout(@PathVariable(value = "id")Long id){
        Estadia nuevaEsta = estadiaService.findById(id);
        EstadoHabitacion disponible = estadoService.findByIdEstadoHabitacion(1l);
        EstadoEstadia calculo = estadoService.findByIdEstadoEstadia(3l);
        nuevaEsta.setEstadoEstadia(calculo);
        nuevaEsta.getHabitacion().setEstadoHabitacion(disponible);
        estadiaService.save(nuevaEsta);
        return nuevaEsta;
    }

*/

    @PutMapping("/checkin")
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia checkin(@RequestBody @Valid Estadia estadia){
        Estadia nuevaEsta = estadiaService.findById(estadia.getId());
        EstadoHabitacion asignada = estadoService.findByIdEstadoHabitacion(2l);
        EstadoEstadia iniciada = estadoService.findByIdEstadoEstadia(2l);
        nuevaEsta.setEstadoEstadia(iniciada);
        nuevaEsta.getHabitacion().setEstadoHabitacion(asignada);
        nuevaEsta.getHabitacion().setCupo(nuevaEsta.getHabitacion().getCupo() - 1);
        estadiaService.save(nuevaEsta);
        return nuevaEsta;
    }

    @PutMapping("/checkout")
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia checkout(@RequestBody @Valid Estadia estadia){
        Estadia nuevaEsta = estadiaService.findById(estadia.getId());
        EstadoHabitacion disponible = estadoService.findByIdEstadoHabitacion(1l);
        EstadoEstadia calculo = estadoService.findByIdEstadoEstadia(3l);
        nuevaEsta.setEstadoEstadia(calculo);
        nuevaEsta.getHabitacion().setEstadoHabitacion(disponible);
        nuevaEsta.getHabitacion().setCupo(nuevaEsta.getHabitacion().getCupo() + 1);
        estadiaService.save(nuevaEsta);
        return nuevaEsta;
    }


}
