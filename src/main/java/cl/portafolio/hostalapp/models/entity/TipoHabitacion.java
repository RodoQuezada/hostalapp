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
@Table(name = "tipos_habitaciones")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoHabitacion implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_TIPO_HABITACION")
    @SequenceGenerator(name = "SEQ_TIPO_HABITACION",allocationSize = 1,sequenceName = "SEQ_TIPO_HABITACION")
    private Long id;
    private String tipo;
    private int precio;
    private int capacidad;

}
