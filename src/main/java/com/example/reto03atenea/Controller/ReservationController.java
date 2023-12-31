package com.example.reto03atenea.Controller;

import com.example.reto03atenea.Model.Reservation;
import com.example.reto03atenea.Model.Reservation;
import com.example.reto03atenea.Model.Reservation;
import com.example.reto03atenea.Service.ReservationService;
import com.example.reto03atenea.Service.ReservationService;
import com.example.reto03atenea.Service.ReservationService;
import com.example.reto03atenea.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;


    @GetMapping("/All")
    public List<Reservation> getAll(){

        return reservationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getReservation (@PathVariable  int id){
        return reservationService.getReservation(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }


}