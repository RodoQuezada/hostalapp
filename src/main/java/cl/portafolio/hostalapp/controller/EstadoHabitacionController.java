package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.services.IEstadoHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estadohabiacion")
public class EstadoHabitacionController {

        @Autowired
        private IEstadoHabitacionService estadoHabitacionService;

        @GetMapping
        @ResponseStatus(HttpStatus.OK)
        public List<EstadoHabitacion> getAll(){
            return estadoHabitacionService.getAll();
        }

}
