package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Estadia;
import cl.portafolio.hostalapp.models.services.IEstadiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/estadia")
public class EstadiaController {

    @Autowired
    private IEstadiaService estadiaService;


    @GetMapping("/load")
    public List<Estadia> load(){
        Date date = new Date();
        Estadia estadia = new Estadia();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    //    estadia.setId(1l);
        estadia.setHabitacion(null);
        estadia.setHuesped(null);
    try{
        estadia.setFechaCheackOut(simpleDateFormat.parse("2013-02-02"));
        estadia.setFechaCheckIn(simpleDateFormat.parse("2013-02-06"));
    }catch (ParseException e){
        e.printStackTrace();
    }
        estadiaService.save(estadia);
        return estadiaService.getAll();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Estadia> getAll(){
        return estadiaService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estadia save(@RequestBody @Valid Estadia estadia){
        return estadiaService.save(estadia);
    }




}
