package com.example.reto03atenea.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="gama")
public class Gama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGama;

    private String name;

    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "gama")

    @JsonIgnoreProperties("gama")
    private List<com.example.reto03atenea.Model.Car> cars;

    public Integer getIdGama() {
        return idGama;
    }

    public void setIdGama(Integer idGama) {
        this.idGama = idGama;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
