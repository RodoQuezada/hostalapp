package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ordenes_de_pedidos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrdenDePedido implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ORDENES_DE_PEDIDOS")
    @SequenceGenerator(name = "SEQ_ORDENES_DE_PEDIDOS",allocationSize = 1,sequenceName = "SEQ_ORDENES_DE_PEDIDOS")
    private Long id;

    @Column(name = "fecha_despacho")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaDespacho;

    @Column(name = "fecha_levantamiento")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaLevantamiento;

    @Column(name = "cantidad_solicitada")
    private int cantidadSolicitada;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoOrdenDePedido estadoOrdenDePedido;

    @ManyToOne(fetch = FetchType.LAZY)
    private Empleado empleado;

    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedor proveedor;

}
