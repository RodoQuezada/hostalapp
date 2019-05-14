package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "estado_habitacion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstadoHabitacion implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_ESTADO_HABITACION")
    @SequenceGenerator(name = "SEQ_ESTADO_HABITACION",allocationSize = 1,sequenceName = "SEQ_ESTADO_HABITACION")
    @Column(name = "id_estado")
    private Long idEstado;

    @Column(name = "estado_habitacion")
    private String estadoHabitacion;

    @JsonIgnore
    @OneToMany(mappedBy = "estadohabitacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Habitacion> habitacionList;

}
