package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Proveedor;
import cl.portafolio.hostalapp.models.service.IProveedorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

    private final IProveedorService proveedorService;

    public ProveedorController(IProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Proveedor> findAll(){
        return proveedorService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Proveedor save(@RequestBody @Valid Proveedor proveedor){
        return proveedorService.save(proveedor);
    }


}
