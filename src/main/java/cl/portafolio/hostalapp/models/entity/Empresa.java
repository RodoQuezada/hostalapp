package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;

@Entity
@Table
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

    public Empresa() {
    }

    public Empresa(String rut, String razonSocial, String nombreEmpresa, String direccionFacturacion, int telefono, RepresentanteLegal representanteLegal) {
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionFacturacion = direccionFacturacion;
        this.telefono = telefono;
        this.representanteLegal = representanteLegal;
    }

    public Empresa(String json) throws IOException {
        Empresa e = new ObjectMapper().readValue(json, Empresa.class);
        this.id = e.getId();
        this.rut = e.getRut();
        this.razonSocial = e.getRazonSocial();
        this.nombreEmpresa = e.getNombreEmpresa();
        this.direccionFacturacion = e.getDireccionFacturacion();
        this.telefono = e.getTelefono();
        this.representanteLegal = e.getRepresentanteLegal();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public RepresentanteLegal getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(RepresentanteLegal representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    /*
    @JsonIgnore
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Huesped> huespedList; */





}
