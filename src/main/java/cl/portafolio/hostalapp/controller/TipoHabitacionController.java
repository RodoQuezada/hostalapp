package cl.portafolio.hostalapp.controller;


import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.services.ITipoHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipohabitacion")
public class TipoHabitacionController {

    @Autowired
    private ITipoHabitacionService tipoHabitacionService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TipoHabitacion> getAll(){
        return tipoHabitacionService.getAll();
    }


}
