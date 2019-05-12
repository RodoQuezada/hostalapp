package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "habitacion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Habitacion implements Serializable {


   // @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "HIBERNATE_SEQUENCE")
   // @SequenceGenerator(name = "HIBERNATE_SEQUENCE",allocationSize = 1,sequenceName = "HIBERNATE_SEQUENCE")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_habitacion")
    private int idHabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoHabitacion estadohabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoHabitacion tipohabitacion;

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public EstadoHabitacion getEstadohabitacion() {
        return estadohabitacion;
    }

    public void setEstadohabitacion(EstadoHabitacion estadohabitacion) {
        this.estadohabitacion = estadohabitacion;
    }

    public TipoHabitacion getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(TipoHabitacion tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }
}
