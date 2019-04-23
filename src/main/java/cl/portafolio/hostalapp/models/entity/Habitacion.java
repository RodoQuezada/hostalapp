package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "HIBERNATE_SEQUENCE")
    @SequenceGenerator(name = "HIBERNATE_SEQUENCE",allocationSize = 1,sequenceName = "HIBERNATE_SEQUENCE")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoHabitacion estadoHabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoHabitacion tipoHabitacion;


}
