package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;

@Entity
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

    public RepresentanteLegal() {
    }

    public RepresentanteLegal(String json) throws IOException{
        RepresentanteLegal r = new ObjectMapper().readValue(json, RepresentanteLegal.class);
        this.id = r.getId();
        this.apellidoMaterno = r.getApellidoMaterno();
        this.apellidoPaterno = r.getApellidoPaterno();
        this.email = r.getEmail();
        this.nombre = r.getNombre();
        this.rut = r.getRut();
        this.telefono = r.getTelefono();
    }

    public RepresentanteLegal(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String email, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.email = email;
        this.telefono = telefono;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
