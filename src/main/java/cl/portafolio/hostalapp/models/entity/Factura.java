package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_FACTURA")
    @SequenceGenerator(name = "SEQ_FACTURA",allocationSize = 1,sequenceName = "SEQ_FACTURA")
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

    public Factura() {
    }

    public Factura(String json) throws IOException {
        Factura f = new ObjectMapper().readValue(json, Factura.class);
        this.id = f.getId();
        this.empresa = f.getEmpresa();
        this.estadoPago = f.isEstadoPago();
        this.estadoVencimiento = f.isEstadoVencimiento();
        this.fechaEmision = f.getFechaEmision();
        this.fechaVencimiento = f.fechaVencimiento;
        this.total = f.getTotal();
    }

    public Factura(Date fechaEmision, Date fechaVencimiento, int total, boolean estadoPago, boolean estadoVencimiento, Empresa empresa) {
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.total = total;
        this.estadoPago = estadoPago;
        this.estadoVencimiento = estadoVencimiento;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public boolean isEstadoVencimiento() {
        return estadoVencimiento;
    }

    public void setEstadoVencimiento(boolean estadoVencimiento) {
        this.estadoVencimiento = estadoVencimiento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
