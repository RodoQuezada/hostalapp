package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrdenDeCompra implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_ORDEN_DE_COMPRA")
    @SequenceGenerator(name = "SEQ_ORDEN_DE_COMPRA",allocationSize = 1,sequenceName = "SEQ_ORDEN_DE_COMPRA")
    private Long id;

    @Column(name = "cantidad_de_huespedes")
    private int cantidadDeHuespedes;

    @Column(name = "total_estadia")
    private int totalEstadia;

    @Column(name = "total_consumido")
    private int totalConsumido;

    @ManyToOne(fetch = FetchType.LAZY)
    private Factura factura;

    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoOrdenCompra estadoOrdenCompra;

    public OrdenDeCompra() {
    }

    public OrdenDeCompra(String json) throws IOException {
        OrdenDeCompra o = new ObjectMapper().readValue(json, OrdenDeCompra.class);
        this.id = o.getId();
        this.cantidadDeHuespedes = o.getCantidadDeHuespedes();
        this.estadoOrdenCompra = o.getEstadoOrdenCompra();
        this.factura = o.getFactura();
        this.totalConsumido = o.getTotalConsumido();
        this.totalEstadia = o.getTotalEstadia();
    }



    public OrdenDeCompra(int cantidadDeHuespedes, int totalEstadia, int totalConsumido, Factura factura, EstadoOrdenCompra estadoOrdenCompra) {
        this.cantidadDeHuespedes = cantidadDeHuespedes;
        this.totalEstadia = totalEstadia;
        this.totalConsumido = totalConsumido;
        this.factura = factura;
        this.estadoOrdenCompra = estadoOrdenCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidadDeHuespedes() {
        return cantidadDeHuespedes;
    }

    public void setCantidadDeHuespedes(int cantidadDeHuespedes) {
        this.cantidadDeHuespedes = cantidadDeHuespedes;
    }

    public int getTotalEstadia() {
        return totalEstadia;
    }

    public void setTotalEstadia(int totalEstadia) {
        this.totalEstadia = totalEstadia;
    }

    public int getTotalConsumido() {
        return totalConsumido;
    }

    public void setTotalConsumido(int totalConsumido) {
        this.totalConsumido = totalConsumido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public EstadoOrdenCompra getEstadoOrdenCompra() {
        return estadoOrdenCompra;
    }

    public void setEstadoOrdenCompra(EstadoOrdenCompra estadoOrdenCompra) {
        this.estadoOrdenCompra = estadoOrdenCompra;
    }
}
