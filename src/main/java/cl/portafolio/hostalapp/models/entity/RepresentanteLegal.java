package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "representante_legal")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RepresentanteLegal implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_REPRESENTANTE")
    @SequenceGenerator(name = "SEQ_REPRESENTANTE",allocationSize = 1,sequenceName = "SEQ_REPRESENTANTE")
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
