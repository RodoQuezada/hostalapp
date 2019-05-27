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
@Table(name = "representante_legal")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RepresentanteLegal implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_REPRESENTANTE_LEGAL")
    @SequenceGenerator(name = "SEQ_REPRESENTANTE_LEGAL",allocationSize = 1,sequenceName = "SEQ_REPRESENTANTE_LEGAL")
    private Long id;

    private String rut;

    private String nombre;

    @Column (name = "apellido_paterno")
    private String apellidoPaterno;

    @Column (name =  "apellido_materno")
    private String apellidoMaterno;

    private String email;

    private int telefono;


}
