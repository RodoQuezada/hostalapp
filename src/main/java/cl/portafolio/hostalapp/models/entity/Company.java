package cl.portafolio.hostalapp.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@Table(name = "companies")
public class Company implements Serializable{

    @Id
   // @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "HIBERNATE_SEQUENCE")
   // @SequenceGenerator(name = "HIBERNATE_SEQUENCE",allocationSize = 1,sequenceName = "HIBERNATE_SEQUENCE")
    private Long id;

    private String name;

    private String adress;


}
