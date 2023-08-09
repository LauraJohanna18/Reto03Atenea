package com.example.reto03atenea.Repository.CRUD;

import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}