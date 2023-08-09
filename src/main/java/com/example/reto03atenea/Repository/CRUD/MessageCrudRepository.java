package com.example.reto03atenea.Repository.CRUD;

import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
