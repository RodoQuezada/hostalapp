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
@Table(name = "dias_minutas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DiaMinuta implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_DIAMINUTA")
    @SequenceGenerator(name = "SEQ_DIAMINUTA",allocationSize = 1,sequenceName = "SEQ_DIAMINUTA")
    private Long id;
    private String dia;

}
