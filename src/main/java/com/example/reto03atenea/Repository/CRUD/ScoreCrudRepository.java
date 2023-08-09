package com.example.reto03atenea.Repository.CRUD;

import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Model.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository<Score, Integer> {
}
