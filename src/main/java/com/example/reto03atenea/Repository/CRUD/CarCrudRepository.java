package com.example.reto03atenea.Repository.CRUD;

import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CarCrudRepository extends CrudRepository<Car, Integer> {

}
