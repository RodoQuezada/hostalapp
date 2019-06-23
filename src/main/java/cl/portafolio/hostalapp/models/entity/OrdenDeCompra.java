package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "ordenes_de_compras")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrdenDeCompra implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADO_ORDEN_COMPRA")
    @SequenceGenerator(name = "SEQ_ESTADO_ORDEN_COMPRA",allocationSize = 1,sequenceName = "SEQ_ESTADO_ORDEN_COMPRA")
    private Long id;

    @Column(name = "total_estadia")
    private int totalEstadia;

    @Column(name = "total_consumido")
    private int totalConsumido;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoOrdenDeCompra estadoOrdenDeCompra;

    /*
    @OneToMany(mappedBy = "ordenDeCompra", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Estadia> estadiaList;
     */

    @ManyToOne(fetch = FetchType.LAZY)
    private Estadia estadia;

    @ManyToOne(fetch = FetchType.LAZY)
    private Factura factura;

    public OrdenDeCompra(String json) throws IOException {
        OrdenDeCompra o = new ObjectMapper().readValue(json, OrdenDeCompra.class);
        this.id = o.getId();
        this.estadoOrdenDeCompra = o.getEstadoOrdenDeCompra();
        this.factura = o.getFactura();
        this.totalConsumido = o.getTotalConsumido();
        this.totalEstadia = o.getTotalEstadia();
        this.estadia = o.getEstadia();
    }

    public OrdenDeCompra() {
    }
}
