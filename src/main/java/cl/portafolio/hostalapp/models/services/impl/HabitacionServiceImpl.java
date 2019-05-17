package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.repository.IHabitacionRepository;
import cl.portafolio.hostalapp.models.services.IHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class HabitacionServiceImpl implements IHabitacionService {


    @Autowired
    private IHabitacionRepository habitacionRepository;


    @Override
    public List<Habitacion> getAll() {
        System.out.println("--Habitacion Servicio getAll. ");
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
        System.out.println("--Habitacion Servicio save. ");
        habitacionRepository.save(habitacion);
        return habitacion;
    }

    @Override
    public Habitacion findById(Long id) {
     //   return habitacionRepository.findById(Long.valueOf(id).intValue()).orElse(null);
        System.out.println("--Habitacion Servicio findById. ");
        return habitacionRepository.findById(Long.valueOf(id).intValue()).orElseThrow(()-> new EntityNotFoundException());
    }


}
