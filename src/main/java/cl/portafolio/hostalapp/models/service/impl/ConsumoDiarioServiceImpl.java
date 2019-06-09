package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.ConsumoDiario;
import cl.portafolio.hostalapp.models.repository.IConsumoDiarioRepository;
import cl.portafolio.hostalapp.models.service.IConsumoDiarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumoDiarioServiceImpl implements IConsumoDiarioService {

    private final IConsumoDiarioRepository consumoDiarioRepository;

    public ConsumoDiarioServiceImpl(IConsumoDiarioRepository consumoDiarioRepository) {
        this.consumoDiarioRepository = consumoDiarioRepository;
    }

    @Override
    public List<ConsumoDiario> findAll() {
        return consumoDiarioRepository.findAll();
    }

    @Override
    public ConsumoDiario save(ConsumoDiario consumoDiario) {
        return consumoDiarioRepository.save(consumoDiario);
    }
}
