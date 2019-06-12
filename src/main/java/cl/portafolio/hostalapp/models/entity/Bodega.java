package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "bodegas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bodega implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_BODEGA")
    @SequenceGenerator(name = "SEQ_BODEGA",allocationSize = 1,sequenceName = "SEQ_BODEGA")
    private Long id;

    @Column(name = "letra_pasillo")
    private String letraPasillo;
    private int capacidad;
    private int cantidad;

    @JsonIgnore
    @OneToMany(mappedBy = "bodega", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Producto> productoList;
}
