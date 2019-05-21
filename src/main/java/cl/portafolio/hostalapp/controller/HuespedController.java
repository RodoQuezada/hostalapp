package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Huesped;
import cl.portafolio.hostalapp.models.services.IHuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/api/huesped")
public class HuespedController {

    @Autowired
    private IHuespedService huespedService;


    @GetMapping("/load")
    @ResponseStatus(HttpStatus.OK)
    public List<Huesped> load(){
        Huesped huesped = new Huesped();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        huesped.setNombre("Rodolfo");
        huesped.setApellidoPaterno("Quezada");
        huesped.setApellidoMaterno("Sierra");
        huesped.setEmail("rodo@gmail.com");
        try{
            huesped.setFechaNacimiento(simpleDateFormat.parse("1985-10-23"));
        } catch (ParseException e){
            e.printStackTrace();
        }
        huesped.setRut("111111");
        huesped.setTelefono(123123123);

        huespedService.save(huesped);
        return huespedService.getAll();
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Huesped> getAll(){
        return huespedService.getAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Huesped save(@RequestBody Huesped huesped){
        return huespedService.save(huesped);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable(value = "id") Long id){
        huespedService.detele(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Huesped update(@PathVariable(value = "id")Long id, @RequestBody @Valid Huesped huesped){
        Huesped update = new Huesped();
        update = huespedService.findById(id);
        update.setNombre(huesped.getNombre());
        update.setTelefono(huesped.getTelefono());
        update.setEmail(huesped.getEmail());
        update.setFechaNacimiento(huesped.getFechaNacimiento());
        update.setApellidoPaterno(huesped.getApellidoPaterno());
        update.setApellidoMaterno(huesped.getApellidoPaterno());
        update.setRut(huesped.getRut());
        update.setEmpresa(huesped.getEmpresa());
        update.setId(huesped.getId());

        huespedService.save(update);
        return update;
    }

}
