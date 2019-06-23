package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "habitaciones")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_HABITACION")
    @SequenceGenerator(name = "SEQ_HABITACION",allocationSize = 1,sequenceName = "SEQ_HABITACION")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoHabitacion estadoHabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoHabitacion tipoHabitacion;


    private int cupo;

    public Habitacion(String json) throws IOException {
        Habitacion h = new ObjectMapper().readValue(json, Habitacion.class);
        this.id = h.getId();
        this.estadoHabitacion = h.getEstadoHabitacion();
        this.tipoHabitacion = h.getTipoHabitacion();
        this.cupo = h.getCupo();
    }

}
