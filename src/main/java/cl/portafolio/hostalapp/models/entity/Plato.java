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
@Table(name = "platos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Plato implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_PLATO")
    @SequenceGenerator(name = "SEQ_PLATO",allocationSize = 1,sequenceName = "SEQ_PLATO")
    private Long id;

    private String descripcion;
    private int precio;

    @ManyToOne
    private TipoPlato tipoPlato;

    @OneToMany(mappedBy = "plato", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetallePlato> detallePlatoList;

}
