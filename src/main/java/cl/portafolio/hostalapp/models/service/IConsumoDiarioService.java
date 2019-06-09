package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.ConsumoDiario;

import java.util.List;

public interface IConsumoDiarioService {

    List<ConsumoDiario> findAll();
    ConsumoDiario save(ConsumoDiario consumoDiario);

}
