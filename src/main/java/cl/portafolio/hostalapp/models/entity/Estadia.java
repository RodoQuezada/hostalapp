package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Habitacion habitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Huesped huesped;

}
