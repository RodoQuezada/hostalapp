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
@Table(name = "detalles_plato")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DetallePlato implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_DETALLE_PLATO")
    @SequenceGenerator(name = "SEQ_DETALLE_PLATO",allocationSize = 1,sequenceName = "SEQ_DETALLE_PLATO")
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "detallePlato", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Producto> productoList;

    @ManyToOne(fetch = FetchType.LAZY)
    private Plato plato;


}
