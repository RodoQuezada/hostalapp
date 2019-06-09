package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estados_ordenes_de_compras")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstadoOrdenDeCompra implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADO_ORDEN_COMPRA")
    @SequenceGenerator(name = "SEQ_ESTADO_ORDEN_COMPRA",allocationSize = 1,sequenceName = "SEQ_ESTADO_ORDEN_COMPRA")
    private Long id;
    private String estado;


}
