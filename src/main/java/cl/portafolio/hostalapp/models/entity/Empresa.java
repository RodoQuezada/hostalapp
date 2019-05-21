package cl.portafolio.hostalapp.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_EMPRESA")
    @SequenceGenerator(name = "SEQ_EMPRESA",allocationSize = 1,sequenceName = "SEQ_EMPRESA")
    private Long id;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name = "direccion_facturacion")
    private String direccionFacturacion;

    private int telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    private RepresentanteLegal representanteLegal;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Huesped> huespedList;

}
