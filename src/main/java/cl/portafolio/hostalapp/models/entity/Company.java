package cl.portafolio.hostalapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@Table(name = "companies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Company implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_COMPANIES")
    @SequenceGenerator(name = "SEQ_COMPANIES",allocationSize = 1,sequenceName = "SEQ_COMPANIES")
    private Long id;

    private String name;

    private String adress;




}
