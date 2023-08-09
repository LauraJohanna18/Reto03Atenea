package com.example.reto03atenea.Service;

import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Model.Client;
import com.example.reto03atenea.Model.Gama;
import com.example.reto03atenea.Repository.CarRepository;
import com.example.reto03atenea.Repository.ClientRepository;
import com.example.reto03atenea.Repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClient(int id) {
        return clientRepository.getClient(id);
    }

    public Client save(Client client) {
        if (client.getIdClient() == null) {
            return clientRepository.save(client);

        } else {
            return client;
        }
    }

    public Client update(Client client) {
        if (client.getIdClient() != null) {
            Optional<Client> clientEncontrado = getClient(client.getIdClient());
            if (clientEncontrado.isPresent()) {

                if (client.getEmail() != null) {
                    clientEncontrado.get().setName(client.getEmail());
                }
                if (client.getName() != null) {
                    clientEncontrado.get().setName(client.getName());

                }

                if (client.getAge() != null) {
                    clientEncontrado.get().setAge(client.getAge());
                }
                if (client.getPassword() != null) {
                    clientEncontrado.get().setPassword(client.getPassword());
                }
            }
            return clientRepository.save(clientEncontrado.get());

        } else {
            return client;
        }

    }

    public boolean deleatedGama(int id) {
        Boolean respuesta = getClient(id).map(client -> {
            clientRepository.delate(client);
            return true;
        }).orElse(false);

        return respuesta;
    }
}
