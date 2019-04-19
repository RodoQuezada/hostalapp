package cl.portafolio.hostalapp.models.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table
public class Huesped implements Serializable {

    @Id
    private Long id;

    private String rut;

    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    private String email;

    private int telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    private Empresa empresa;



}
