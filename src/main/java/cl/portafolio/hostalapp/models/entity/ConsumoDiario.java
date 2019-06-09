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
@Table(name = "consumos_diarios")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ConsumoDiario implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_CONSUMOS_DIARIOS")
    @SequenceGenerator(name = "SEQ_CONSUMOS_DIARIOS",allocationSize = 1,sequenceName = "SEQ_CONSUMOS_DIARIOS")
    private Long id;

    @Column(name = "fecha_consumo")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaConsumo;


    @ManyToOne(fetch = FetchType.LAZY)
    private Estadia estadia;

    @ManyToOne(fetch = FetchType.LAZY)
    private Minuta minuta;
}
