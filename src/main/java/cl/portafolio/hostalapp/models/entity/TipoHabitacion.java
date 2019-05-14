package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "tipo_habitacion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoHabitacion implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_TIPO_HABITACION")
    @SequenceGenerator(name = "SEQ_TIPO_HABITACION",allocationSize = 1,sequenceName = "SEQ_TIPO_HABITACION")
    @Column(name = "id_tipo")
    private Long idTipo;

    @Column(name = "precio_habitacion")
    private int precioTipoHabitacion;

    @Column(name = "capacidad_habitacion")
    private int capacidadTipoHabitacion;

    @Column(name = "tipo_habitacion")
    private String tipoHabitacion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipohabitacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Habitacion> habitacionList;


}
