package com.example.reto03atenea.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

import java.util.Date;


@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;

    private Date startDate;

    private Date devolutionDate;

    private String status = "created";

    //Car
    @ManyToOne
    @JoinColumn(name="carId")
    @JsonIgnoreProperties("reservations")
    private com.example.reto03atenea.Model.Car car;

    //Cliente
    @ManyToOne
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"reservations", "messages"})
    private com.example.reto03atenea.Model.Client client;

    //Score
    @OneToOne
    @JsonIgnoreProperties("reservations")
    private com.example.reto03atenea.Model.Score score;

    public Reservation() {
    }


    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
}
