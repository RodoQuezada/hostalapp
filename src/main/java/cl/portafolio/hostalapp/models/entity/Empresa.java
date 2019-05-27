package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_EMPRESA")
    @SequenceGenerator(name = "SEQ_EMPRESA",allocationSize = 1,sequenceName = "SEQ_EMPRESA")
    private Long id;

    private String rut;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name = "direccion_facturacion")
    private String direccionFacturacion;

    private int telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    private RepresentanteLegal representanteLegal;

    @JsonIgnore
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Huesped> huespedList;

}
