package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.IOException;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movimientos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movimiento {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_MOVIMIENTO")
    @SequenceGenerator(name = "SEQ_MOVIMIENTO",allocationSize = 1,sequenceName = "SEQ_MOVIMIENTO")
    private Long id;

    @Column(name = "fecha")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producto;

    public Movimiento(String json) throws IOException {
        Movimiento m = new ObjectMapper().readValue(json, Movimiento.class);
        this.id = m.getId();
        this.cantidad = m.getCantidad();
        this.fecha = m.getFecha();
        this.producto = m.getProducto();
    }





}
