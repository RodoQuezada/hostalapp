package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.repository.IHabitacionRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class HabitacionServiceImplTest {

/*
    @Mock
    IHabitacionRepository habitacionRepository;
    HabitacionServiceImpl habitacionService;

    //new tipo de habitacion
    TipoHabitacion tipo_habitacion_uno = new TipoHabitacion();
    //new Estado de habitacion
    EstadoHabitacion estado_uno = new EstadoHabitacion();

    //new habitacion
    Habitacion habitacion_uno = new Habitacion();


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        habitacionService = new HabitacionServiceImpl(habitacionRepository);

        tipo_habitacion_uno.setId(1l);
        tipo_habitacion_uno.setCapacidadTipoHabitacion(1);
        tipo_habitacion_uno.setPrecioTipoHabitacion(15000);
        tipo_habitacion_uno.setTipoHabitacion("king");

        estado_uno.setId(1l);
        estado_uno.setEstadoHabitacion("Disponible");

        habitacion_uno.setId(1l);
        habitacion_uno.setTipoHabitacion(tipo_habitacion_uno);
        habitacion_uno.setEstadoHabitacion(estado_uno);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAll() {
        Habitacion habitacion_1 = new Habitacion();
        Habitacion habitacion_2 = new Habitacion();
        when(habitacionRepository.findAll()).thenReturn(Arrays.asList(habitacion_1, habitacion_2));
        List<Habitacion> habitacionList = habitacionService.getAll();
        assertEquals(3, habitacionList.size());

    }

    @Test
    public void save() {

        Habitacion habitacion_dos = new Habitacion();
        habitacion_dos.setEstadoHabitacion(estado_uno);
        habitacion_dos.setTipoHabitacion(tipo_habitacion_uno);


        // get by id

        // assertEquals("");

    }

    @Test
    public void getById() {

        Habitacion habitacion_tres = new Habitacion();
        habitacion_tres.setId(3l);
        habitacion_tres.setEstadoHabitacion(estado_uno);
        habitacion_tres.setTipoHabitacion(tipo_habitacion_uno);



        Habitacion habitacion_resultado = new Habitacion();

        try {
            habitacion_resultado = habitacionService.getById(3l);
        }catch (Exception e){
            System.out.println("cago: " + e.toString());
        }


        System.out.println("----->" + habitacion_resultado.getId());

        assertThat(habitacion_resultado.getId(), is(3l));
        assertTrue(habitacion_resultado.getId() == 3);
        assertEquals("King", habitacion_resultado.getTipoHabitacion().getTipoHabitacion());



    } */
}