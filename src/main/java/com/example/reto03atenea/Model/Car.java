package com.example.reto03atenea.Model;


import com.example.reto03atenea.Controller.MessageController;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCar;
    private String Name;

    private Integer Gama;
    private String brand;

    private Integer Year;

    private Integer Description;

    // gama
    @ManyToOne
    @JoinColumn(name = "gamaId")
    @JsonIgnoreProperties("cars")
    private Gama gama;

    //messages
    @OneToMany
    @JsonIgnoreProperties({"car", "client"})
    private List<Message> messages;


    //reservas
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "car")
    @JsonIgnoreProperties ({"car", "client"})
    private  List<Reservation> reservations;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public Integer getDescription() {
        return Description;
    }

    public void setDescription(Integer description) {
        Description = description;
    }

    public Integer getGama() {
        return Gama;
    }

    public void setGama(Integer gama) {
        Gama = gama;
    }
}
