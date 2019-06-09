package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "huespedes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Huesped implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_HUESPED")
    @SequenceGenerator(name = "SEQ_HUESPED",allocationSize = 1,sequenceName = "SEQ_HUESPED")
    private Long id;

    private String rut;
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    private String email;
    private int telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    private Empresa empresa;

    public Huesped (String json) throws IOException {
        Huesped h = new ObjectMapper().readValue(json, Huesped.class);
        this.id = h.getId();
        this.apellidoMaterno = h.getApellidoMaterno();
        this.apellidoPaterno = h.getApellidoPaterno();
        this.email = h.getEmail();
        this.empresa = h.getEmpresa();
        this.nombre = h.getNombre();
        this.rut = h.getRut();
        this.telefono = h.getTelefono();
    }

}
