package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estados_ordenes_de_pedidos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstadoOrdenDePedido implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADOS_ORDENES_PEDIDO")
    @SequenceGenerator(name = "SEQ_ESTADOS_ORDENES_PEDIDO",allocationSize = 1,sequenceName = "SEQ_ESTADOS_ORDENES_PEDIDO")
    private Long id;

    private String estado;

}
