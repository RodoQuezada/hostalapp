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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "facturas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_FACTURA")
    @SequenceGenerator(name = "SEQ_FACTURA",allocationSize = 1,sequenceName = "SEQ_FACTURA")
    private Long id;

    @Column(name = "fecha_emision")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;

    @Column(name = "fecha_vencimiento")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;

    private int total;
    private boolean pagado;

    @JsonIgnore
    @OneToMany(mappedBy = "factura", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrdenDeCompra> ordenDeCompraList;

    public Factura(String json) throws IOException {
        Factura f = new ObjectMapper().readValue(json, Factura.class);
        this.id = f.getId();
        this.pagado = f.isPagado();
        this.fechaEmision = f.getFechaEmision();
        this.fechaVencimiento = f.fechaVencimiento;
        this.total = f.getTotal();
        this.ordenDeCompraList = f.getOrdenDeCompraList();
    }


}
