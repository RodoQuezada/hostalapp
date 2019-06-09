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
@Table(name = "productos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_PRODUCTO")
    @SequenceGenerator(name = "SEQ_PRODUCTO",allocationSize = 1,sequenceName = "SEQ_PRODUCTO")
    private Long id;

    private String nombre;
    private int precio;
    private int stock;
    private String caracteristicas;

    @ManyToOne(fetch = FetchType.LAZY)
    private Bodega bodega;


}
