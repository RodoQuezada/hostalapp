package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estados_estadia")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstadoEstadia implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADO_ESTADIA")
    @SequenceGenerator(name = "SEQ_ESTADO_ESTADIA",allocationSize = 1,sequenceName = "SEQ_ESTADO_ESTADIA")
    private Long id;
    private String estado;

}
