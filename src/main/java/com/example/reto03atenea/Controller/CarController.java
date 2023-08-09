package com.example.reto03atenea.Controller;

import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Car")
public class CarController {
    @Autowired
    private CarService carService;


    @GetMapping("/All")
    public List<Car> getAll(){

        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCar (@PathVariable  int id){
        return carService.getCar(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Car save(@RequestBody Car car) {
        return carService.save(car);
    }


}