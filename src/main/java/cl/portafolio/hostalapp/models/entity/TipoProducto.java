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
@Table(name = "tipos_productos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoProducto implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_TIPO_PRODUCTO")
    @SequenceGenerator(name = "SEQ_TIPO_PRODUCTO",allocationSize = 1,sequenceName = "SEQ_TIPO_PRODUCTO")
    private Long id;
    private String tipo;

}
