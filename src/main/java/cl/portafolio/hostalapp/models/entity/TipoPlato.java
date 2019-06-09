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
@Table(name = "tipos_platos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoPlato implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_PLATO")
    @SequenceGenerator(name = "SEQ_PLATO",allocationSize = 1,sequenceName = "SEQ_PLATO")
    private Long id;

    private String tipo;  //ejecutivo, general, etc.
    private String motivo;  //desayuno, almuerzo, cena.


}
