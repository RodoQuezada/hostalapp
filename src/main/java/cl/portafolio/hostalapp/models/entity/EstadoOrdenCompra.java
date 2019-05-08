package cl.portafolio.hostalapp.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table
public class EstadoOrdenCompra implements Serializable {
    @Id
    private Long id;
    private String estado;
}
