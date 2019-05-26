package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Factura implements Serializable {

    @Id
    private Long id;

    @Column(name = "fecha_emision")
    private Date fechaEmision;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    private int total;

    @Column(name = "estado_pago")
    private boolean estadoPago;

    @Column(name = "estado_vencimiento")
    private boolean estadoVencimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    private Empresa empresa;




}
