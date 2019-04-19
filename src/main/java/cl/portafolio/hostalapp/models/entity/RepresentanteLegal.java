package cl.portafolio.hostalapp.models.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "representante_legal")
public class RepresentanteLegal implements Serializable {

    @Id
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
