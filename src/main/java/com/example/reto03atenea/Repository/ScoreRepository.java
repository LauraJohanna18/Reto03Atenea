package com.example.reto03atenea.Repository;

import com.example.reto03atenea.Model.Score;
import com.example.reto03atenea.Repository.CRUD.ScoreCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCrudRepository scoreCrudRepository;


    public List<Score> findAll() {
        return (List<Score>) scoreCrudRepository.findAll();
    }
    public Optional<Score> getScore(int id){
        return scoreCrudRepository.findById(id);
    }

    public Score save(Score score){
        return scoreCrudRepository.save(score);
    }

    public void delate(Score score) {
        scoreCrudRepository.delete(score);
    }

}
