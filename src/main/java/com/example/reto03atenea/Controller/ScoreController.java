package com.example.reto03atenea.Controller;

import com.example.reto03atenea.Model.Score;
import com.example.reto03atenea.Model.Score;
import com.example.reto03atenea.Model.Score;
import com.example.reto03atenea.Service.ScoreService;
import com.example.reto03atenea.Service.ScoreService;
import com.example.reto03atenea.Service.ScoreService;
import com.example.reto03atenea.Service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;


    @GetMapping("/All")
    public List<Score> getAll(){

        return scoreService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Score> getScore (@PathVariable  int id){
        return scoreService.getScore(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score score) {
        return scoreService.save(score);
    }


}