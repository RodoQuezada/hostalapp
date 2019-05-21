package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.RepresentanteLegal;
import cl.portafolio.hostalapp.models.services.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/representantelegal")
public class RepresentanteLegalController {

    @Autowired
    private IRepresentanteLegalService representanteLegalService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RepresentanteLegal> getAll(){
        System.out.println("-- Representante legal controller getAll");
        return representanteLegalService.findAll();
    }

    @GetMapping("/load")
    @ResponseStatus(HttpStatus.OK)
    public List<RepresentanteLegal> load(){
        RepresentanteLegal repre = new RepresentanteLegal();
        repre.setNombre("Rafael");
        repre.setApellidoPaterno("Quezada");
        repre.setApellidoMaterno("Ojeda");
        repre.setTelefono(123123);
        repre.setEmail("rafa@gmail.com");
        repre.setRut("1231123-k");
        representanteLegalService.save(repre);
        return representanteLegalService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RepresentanteLegal save(@RequestBody @Valid RepresentanteLegal representanteLegal){
        return representanteLegalService.save(representanteLegal);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.UPGRADE_REQUIRED)
    public RepresentanteLegal updateRepresent(@PathVariable(value = "id")Long id, @RequestBody @Valid RepresentanteLegal representanteLegal){
        System.out.println("-- Representante Legal controlador save: " + representanteLegal.toString());
        RepresentanteLegal upRepre = representanteLegalService.findById(id);
     //   upRepre.setId(representanteLegal.getId());
        upRepre.setNombre(representanteLegal.getNombre());
        upRepre.setApellidoPaterno(representanteLegal.getApellidoPaterno());
        upRepre.setApellidoMaterno(representanteLegal.getApellidoMaterno());
        upRepre.setEmail(representanteLegal.getEmail());
        upRepre.setRut(representanteLegal.getRut());
        upRepre.setTelefono(representanteLegal.getTelefono());
        representanteLegalService.save(upRepre);
        return upRepre;
    }





}
