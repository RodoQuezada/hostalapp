package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstadoOrdenCompra implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_ESTADO_ORDEN_COMPRA")
    @SequenceGenerator(name = "SEQ_ESTADO_ORDEN_COMPRA",allocationSize = 1,sequenceName = "SEQ_ESTADO_ORDEN_COMPRA")
    private Long id;
    private String estado;

    public EstadoOrdenCompra() {
    }

    public EstadoOrdenCompra(String json) throws IOException {
        EstadoOrdenCompra e = new ObjectMapper().readValue(json, EstadoOrdenCompra.class);
        this.id = e.getId();
        this.estado = e.getEstado();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
