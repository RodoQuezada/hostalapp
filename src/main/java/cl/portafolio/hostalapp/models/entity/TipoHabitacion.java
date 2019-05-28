package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Entity
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

    public TipoHabitacion() {
    }

    public TipoHabitacion(String json) throws IOException {
        TipoHabitacion t = new ObjectMapper().readValue(json, TipoHabitacion.class);
        this.idTipo = t.getIdTipo();
        this.capacidadTipoHabitacion = t.getCapacidadTipoHabitacion();
        this.precioTipoHabitacion = t.getPrecioTipoHabitacion();
        this.tipoHabitacion = t.getTipoHabitacion();
        this.habitacionList = t.getHabitacionList();
    }

    public TipoHabitacion(int precioTipoHabitacion, int capacidadTipoHabitacion, String tipoHabitacion, List<Habitacion> habitacionList) {
        this.precioTipoHabitacion = precioTipoHabitacion;
        this.capacidadTipoHabitacion = capacidadTipoHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.habitacionList = habitacionList;
    }

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public int getPrecioTipoHabitacion() {
        return precioTipoHabitacion;
    }

    public void setPrecioTipoHabitacion(int precioTipoHabitacion) {
        this.precioTipoHabitacion = precioTipoHabitacion;
    }

    public int getCapacidadTipoHabitacion() {
        return capacidadTipoHabitacion;
    }

    public void setCapacidadTipoHabitacion(int capacidadTipoHabitacion) {
        this.capacidadTipoHabitacion = capacidadTipoHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public List<Habitacion> getHabitacionList() {
        return habitacionList;
    }

    public void setHabitacionList(List<Habitacion> habitacionList) {
        this.habitacionList = habitacionList;
    }
}
