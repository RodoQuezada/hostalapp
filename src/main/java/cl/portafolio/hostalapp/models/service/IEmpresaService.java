package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    List<Empresa> findAll();
    Empresa save(Empresa empresa);
    Empresa findById(Long id);

}
