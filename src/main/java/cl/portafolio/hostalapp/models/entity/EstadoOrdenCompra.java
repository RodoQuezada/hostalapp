package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstadoOrdenCompra implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADO_ORDEN_COMPRA")
    @SequenceGenerator(name = "SEQ_ESTADO_ORDEN_COMPRA",allocationSize = 1,sequenceName = "SEQ_ESTADO_ORDEN_COMPRA")
    private Long id;
    private String estado;
}
