package com.example.reto03atenea.Repository;


import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Repository.CRUD.CarCrudRepository;
import com.fasterxml.jackson.annotation.OptBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Crear
//Retrive (obtener)
//Update (acturalizar)
//Delate (eliminar)


@Repository
public class CarRepository {
    @Autowired
    private CarCrudRepository carCrudRepository;

    public List<Car> findAll() {
        return (List<Car>) carCrudRepository.findAll();
    }
    public Optional<Car> getCar(int id){
        return carCrudRepository.findById(id);
    }

    public Car save(Car car){
        return carCrudRepository.save(car);
    }
    public void delate(Car car) {
        carCrudRepository.delete(car);
    }

}