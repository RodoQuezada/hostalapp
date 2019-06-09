package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estados_habitaciones")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstadoHabitacion implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADO_HABITACION")
    @SequenceGenerator(name = "SEQ_ESTADO_HABITACION",allocationSize = 1,sequenceName = "SEQ_ESTADO_HABITACION")
    private Long id;

    private String estado;

}
