package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "minutas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Minuta implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_MINUTA")
    @SequenceGenerator(name = "SEQ_MINUTA",allocationSize = 1,sequenceName = "SEQ_MINUTA")
    private Long id;

    @Column(name = "fecha_inicio")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fecha_termino")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fechaTermino;

    @ManyToOne(fetch = FetchType.LAZY)
    private Plato plato;

    @ManyToOne(fetch = FetchType.LAZY)
    private DiaMinuta diaMinuta;


}
