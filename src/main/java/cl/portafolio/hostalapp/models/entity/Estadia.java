package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estadia implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_ESTADIA")
    @SequenceGenerator(name = "SEQ_ESTADIA",allocationSize = 1,sequenceName = "SEQ_ESTADIA")
    private Long id;

    @Column(name = "fecha_check_in")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaCheckIn;

    @Column(name = "fecha_check_out")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaCheckOut;

    @Column(name = "fecha_reserva")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaReserva;

    private boolean estado;

    @ManyToOne(fetch = FetchType.LAZY)
    private Habitacion habitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Huesped huesped;

    public Estadia() {
    }

    public Estadia(String json) throws IOException{
        Estadia e = new ObjectMapper().readValue(json, Estadia.class);
        this.id = e.getId();
        this.fechaCheckIn = e.getFechaCheckIn();
        this.fechaCheckOut = e.getFechaCheckOut();
        this.habitacion = e.getHabitacion();
        this.huesped = e.getHuesped();
        this.fechaReserva = e.fechaReserva;
        this.estado = e.estado;
    }

    public Estadia(Date fechaCheckIn, Date fechaCheckOut, Habitacion habitacion, Huesped huesped, Date fechaReserva,boolean estado) {
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(Date fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public Date getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(Date fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
