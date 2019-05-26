package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrdenDeCompra implements Serializable {


    @Id
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


}
