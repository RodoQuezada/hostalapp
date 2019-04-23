package cl.portafolio.hostalapp.models.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "tipo_habitacion")
public class TipoHabitacion implements Serializable {

    @Id
    private Long id;

    @Column(name = "precio_habitacion")
    private int precioTipoHabitacion;

    @Column(name = "capacidad_habitacion")
    private int capacidadTipoHabitacion;

    @Column(name = "tipo_habitacion")
    private String tipoHabitacion;

}
