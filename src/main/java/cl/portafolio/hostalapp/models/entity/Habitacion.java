package cl.portafolio.hostalapp.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table
public class Habitacion implements Serializable {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoHabitacion estadoHabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoHabitacion tipoHabitacion;


}
