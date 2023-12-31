package com.example.reto03atenea.Repository;

import com.example.reto03atenea.Model.Gama;
import com.example.reto03atenea.Repository.CRUD.GamaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GamaRepository {
    @Autowired
    private GamaCrudRepository gamaCrudRepository;


    public List<Gama> findAll() {
        return (List<Gama>) gamaCrudRepository.findAll();
    }
    public Optional<Gama> getGama(int id){
        return gamaCrudRepository.findById(id);
    }

    public Gama save(Gama gama){
        return gamaCrudRepository.save(gama);
    }
    public void delate(Gama gama) {
        gamaCrudRepository.delete(gama);
    }

}
