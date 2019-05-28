package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Entity
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

    public EstadoHabitacion() {
    }

    public EstadoHabitacion(String json) throws IOException{
        EstadoHabitacion e = new ObjectMapper().readValue(json, EstadoHabitacion.class);
        this.idEstado = e.idEstado;
        this.estadoHabitacion = e.estadoHabitacion;
    }

    public EstadoHabitacion(String estadoHabitacion, List<Habitacion> habitacionList) {
        this.estadoHabitacion = estadoHabitacion;
        this.habitacionList = habitacionList;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public List<Habitacion> getHabitacionList() {
        return habitacionList;
    }

    public void setHabitacionList(List<Habitacion> habitacionList) {
        this.habitacionList = habitacionList;
    }
}
