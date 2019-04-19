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
