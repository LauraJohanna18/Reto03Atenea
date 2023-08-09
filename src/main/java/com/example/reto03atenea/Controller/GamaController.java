package com.example.reto03atenea.Controller;

import com.example.reto03atenea.Model.Gama;
import com.example.reto03atenea.Model.Gama;
import com.example.reto03atenea.Model.Gama;
import com.example.reto03atenea.Service.GamaService;
import com.example.reto03atenea.Service.GamaService;
import com.example.reto03atenea.Service.GamaService;
import com.example.reto03atenea.Service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Gama")
public class GamaController {
    @Autowired
    private GamaService gamaService;


    @GetMapping("/All")
    public List<Gama> getAll(){

        return gamaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Gama> getGama (@PathVariable  int id){
        return gamaService.getGama(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama save(@RequestBody Gama gama) {
        return gamaService.save(gama);
    }


}