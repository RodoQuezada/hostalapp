package cl.portafolio.hostalapp.models.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "estado_habitacion")
public class EstadoHabitacion implements Serializable {

    @Id
    private Long id;

    @Column(name = "estado_habitacion")
    private String estadoHabitacion;

}
