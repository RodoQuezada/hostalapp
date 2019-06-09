package cl.portafolio.hostalapp.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "proveedores")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "SEQ_PROVEEDORES")
    @SequenceGenerator(name = "SEQ_PROVEEDORES",allocationSize = 1,sequenceName = "SEQ_PROVEEDORES")
    private Long id;

    private String rut;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "nombre_delegado")
    private String nombreDelegado;
    @Column(name = "apellido_delegado")
    private String apellidoDelegado;
    @Column(name = "rut_delegado")
    private String rutDelegado;
    @Column(name = "email_delegado")
    private String emailDelegado;

    @OneToMany(mappedBy = "proveedor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrdenDePedido> ordenDePedidoList;

}
