package cl.portafolio.hostalapp.controller;


import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.repository.IEstadoHabitacionRepository;
import cl.portafolio.hostalapp.models.repository.ITipoHabitacionRepository;
import cl.portafolio.hostalapp.models.services.IHabitacionService;
import cl.portafolio.hostalapp.models.services.ITipoHabitacionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/habitacion")
@CrossOrigin(origins = "http://localhost:54239")
public class HabitacionController {


    final static Logger logger = Logger.getLogger(HabitacionController.class);

    @Autowired
    private IHabitacionService habitacionService;

    @Autowired
    private IEstadoHabitacionRepository estadoHabitacionRepository;

    @Autowired
    private ITipoHabitacionService tipoHabitacionRepository;

    @GetMapping("/load")
    public List<Habitacion> load(){

        TipoHabitacion tipoHabitacion = new TipoHabitacion();
        tipoHabitacion.setIdTipo(10l);
        tipoHabitacion.setTipoHabitacion("Triple King");
        tipoHabitacion.setPrecioTipoHabitacion(1500000);
        tipoHabitacion.setCapacidadTipoHabitacion(2);

        EstadoHabitacion estadoHabitacion = new EstadoHabitacion();
        estadoHabitacion.setIdEstado(10l);
        estadoHabitacion.setEstadoHabitacion("pruebaaaa");

        estadoHabitacionRepository.save(estadoHabitacion);
        tipoHabitacionRepository.save(tipoHabitacion);

        Habitacion habitacion = new Habitacion();
        habitacion.setIdHabitacion(11);
        habitacion.setEstadohabitacion(estadoHabitacion);
        habitacion.setTipohabitacion(tipoHabitacion);

        habitacionService.save(habitacion);

        return habitacionService.getAll();
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Habitacion> getAll(){
        System.out.println("--Habitacion Controlador getAll. ");
        return habitacionService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion save(@RequestBody Habitacion habitacion){
        System.out.println("--Habitacion Controlador save: " + habitacion.toString());
        return habitacionService.save(habitacion);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.UPGRADE_REQUIRED)
    public Habitacion updateHabitacion(@PathVariable(value = "id")Long id, @RequestBody @Valid Habitacion habitacion){
        System.out.println("--Habitacion Controlador updateHabitacion: " + habitacion.toString()+ "id: "+ id);
        Habitacion newHabitacion = habitacionService.findById(id);
        newHabitacion.setTipohabitacion(habitacion.getTipohabitacion());
        newHabitacion.setEstadohabitacion(habitacion.getEstadohabitacion());
        habitacionService.save(newHabitacion);
        return newHabitacion;
    }

    @GetMapping("/estados")
    public List<EstadoHabitacion> getEstados(){
        return (List<EstadoHabitacion>) estadoHabitacionRepository.findAll();
    }

}
