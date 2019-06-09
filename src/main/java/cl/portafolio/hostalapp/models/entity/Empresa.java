package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empresas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_EMPRESA")
    @SequenceGenerator(name = "SEQ_EMPRESA",allocationSize = 1,sequenceName = "SEQ_EMPRESA")
    private Long id;

    private String rut;
    @Column(name = "razon_social")
    private String razonSocial;
    private String nombre;
    private int telefono;
    private String direccion;
    @Column(name = "rut_representante")
    private String rutRepresentante;
    @Column(name = "nombre_representante")
    private String nombreRepresentante;
    @Column(name = "apellido_paterno_representante")
    private String apellidoPaternoRepresentante;
    @Column(name = "apellido_materno_representante")
    private String apellidoMaternoRepresentante;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Huesped> huespedList;

    public Empresa(String json) throws IOException {
        Empresa e = new ObjectMapper().readValue(json, Empresa.class);
        this.id = e.getId();
        this.rut = e.getRut();
        this.razonSocial = e.getRazonSocial();
        this.nombreRepresentante = e.getNombreRepresentante();
        this.direccion = e.getDireccion();
        this.telefono = e.getTelefono();
        this.apellidoMaternoRepresentante = e.getApellidoMaternoRepresentante();
        this.apellidoPaternoRepresentante = e.getApellidoPaternoRepresentante();
        this.nombre = e.getNombre();
        this.rutRepresentante = e.getRutRepresentante();
    }


}
