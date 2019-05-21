package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    List<Empresa> getAll();
    Empresa save(Empresa empresa);
    Empresa findById(Long id);
   // List<Empresa> delete (Long id);


}
