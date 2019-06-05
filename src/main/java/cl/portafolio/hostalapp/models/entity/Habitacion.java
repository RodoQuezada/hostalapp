package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;

@Entity
@Table(name = "habitacion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_HABITACION")
    @SequenceGenerator(name = "SEQ_HABITACION",allocationSize = 1,sequenceName = "SEQ_HABITACION")
    @Column(name = "id_habitacion")
    private int idHabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoHabitacion estadohabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoHabitacion tipohabitacion;

    private int cupo;

    public Habitacion() {
    }

    public Habitacion(String json) throws IOException{
        Habitacion h = new ObjectMapper().readValue(json, Habitacion.class);
        this.idHabitacion = h.getIdHabitacion();
        this.estadohabitacion = h.getEstadohabitacion();
        this.cupo = h.getCupo();
    }

    public Habitacion(EstadoHabitacion estadohabitacion, TipoHabitacion tipohabitacion, int cupo) {
        this.estadohabitacion = estadohabitacion;
        this.tipohabitacion = tipohabitacion;
        this.cupo = cupo;
    }

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

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}
