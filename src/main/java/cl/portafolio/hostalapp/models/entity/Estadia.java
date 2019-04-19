package cl.portafolio.hostalapp.models.entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table
public class Estadia implements Serializable {

    @Id
    private Long id;

    @Column(name = "fecha_check_in")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaCheckIn;

    @Column(name = "fecha_check_out")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaCheackOut;

    @ManyToOne(fetch = FetchType.LAZY)
    private Habitacion habitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Huesped huesped;

}
