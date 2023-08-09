package com.example.reto03atenea.Controller;

import com.example.reto03atenea.Model.Message;
import com.example.reto03atenea.Model.Message;
import com.example.reto03atenea.Model.Message;
import com.example.reto03atenea.Service.MessageService;
import com.example.reto03atenea.Service.MessageService;
import com.example.reto03atenea.Service.MessageService;
import com.example.reto03atenea.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    private MessageService messageService;


    @GetMapping("/All")
    public List<Message> getAll(){

        return messageService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getMessage (@PathVariable  int id){
        return messageService.getMessage(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message) {
        return messageService.save(message);
    }


}
