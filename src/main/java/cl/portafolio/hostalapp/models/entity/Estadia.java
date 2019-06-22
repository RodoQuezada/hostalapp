package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "estadias")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estadia implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADIA")
    @SequenceGenerator(name = "SEQ_ESTADIA",allocationSize = 1,sequenceName = "SEQ_ESTADIA")
    private Long id;

    @Column(name = "fecha_check_in")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaCheckIn;

    @Column(name = "fecha_check_out")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fechaCheckOut;

    @Column(name = "fecha_reserva")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fechaReserva;

    @ManyToOne
    private EstadoEstadia estadoEstadia;

    @ManyToOne
    private Habitacion habitacion;

    @ManyToOne
    private Huesped huesped;

    /*
    @ManyToOne
    private OrdenDeCompra ordenDeCompra; */

    @JsonIgnore
    @OneToMany(mappedBy = "estadia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<OrdenDeCompra> ordenDeCompras;

    @JsonIgnore
    @OneToMany(mappedBy = "estadia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ConsumoDiario> consumoDiarios;

    public Estadia(String json) throws IOException {
        Estadia e = new ObjectMapper().readValue(json, Estadia.class);
        this.id = e.getId();
        this.fechaCheckIn = e.getFechaCheckIn();
        this.fechaCheckOut = e.getFechaCheckOut();
        this.habitacion = e.getHabitacion();
        this.huesped = e.getHuesped();
        this.fechaReserva = e.getFechaReserva();
        this.estadoEstadia = e.getEstadoEstadia();
        this.ordenDeCompras = e.ordenDeCompras;
    }


}
