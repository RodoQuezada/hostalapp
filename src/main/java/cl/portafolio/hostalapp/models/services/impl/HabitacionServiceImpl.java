package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.repository.IHabitacionRepository;
import cl.portafolio.hostalapp.models.repository.ITipoHabitacionRepository;
import cl.portafolio.hostalapp.models.services.IHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HabitacionServiceImpl implements IHabitacionService {


    @Autowired
    private IHabitacionRepository habitacionRepository;


    @Override
    public List<Habitacion> getAll() {
        System.out.println(" ------  pasa al servicio");
        return (List<Habitacion>) habitacionRepository.findAll();
    }



    /*
    @Override
    @Transactional
    public List<Habitacion> getAll(){
        List<Habitacion> habitacionList = new ArrayList<>();
        //habitacionRepository.findAll().forEach(habitacionList::add);
        habitacionList = (List<Habitacion>) habitacionRepository.findAll();
        System.out.println("cuasdasdasd -->"+ habitacionList.size());
        return habitacionList;
    }*/

    @Override
    public Habitacion save(Habitacion habitacion) {
        System.out.println("---- asaaaaaaaaaaaa----------- ");
        habitacionRepository.save(habitacion);
        return habitacion;
    }




}
