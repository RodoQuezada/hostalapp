package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Empleado;
import cl.portafolio.hostalapp.models.service.IEmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin(origins = "http://localhost:51653")
public class EmpleadoController {

    private final IEmpleadoService empleadoService;


    public EmpleadoController(IEmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Empleado> findAll(){
        return empleadoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado save(@RequestBody @Valid Empleado empleado){
        return empleadoService.save(empleado);
    }
}


