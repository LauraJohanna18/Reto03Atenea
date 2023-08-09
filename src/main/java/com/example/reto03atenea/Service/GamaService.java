package com.example.reto03atenea.Service;

import com.example.reto03atenea.Model.Gama;
import com.example.reto03atenea.Model.Gama;
import com.example.reto03atenea.Repository.CarRepository;
import com.example.reto03atenea.Repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.theme.CookieThemeResolver;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class GamaService {

    @Autowired
    private GamaRepository gamaRepository;

    public List<Gama> getAll() {
        return gamaRepository.findAll();
    }

    public Optional<Gama> getGama(int id) {
        return gamaRepository.getGama(id);
    }

    public Gama save(Gama gama) {
        if (gama.getIdGama() == null) {
            return gamaRepository.save(gama);

        } else {
            return gama;
        }
    }

    public Gama update(Gama gama) {
        if (gama.getIdGama() != null) {
            Optional<Gama> gamaEncontrado = getGama(gama.getIdGama());
            if (gamaEncontrado.isPresent()) {
                if (gama.getIdGama() != null) {
                    gamaEncontrado.get().setIdGama(gama.getIdGama());
                }
                if (gama.getName() != null) {
                    gamaEncontrado.get().setName(gama.getName());

                }if (gama.getDescription() != null) {
                    gamaEncontrado.get().setDescription (gama.getDescription());
                }if (gama.getDescription() != null) {
                    gamaEncontrado.get().setDescription(gama.getDescription());

                }
                return gamaRepository.save(gamaEncontrado.get());

            } else {
                return gama;
            }
        } else {
            return gama;
        }
    }

    public boolean deleatedGama(int id) {
        Boolean respuesta = getGama(id).map(gama -> {
            gamaRepository.delate(gama);
            return true;
        }).orElse(false);

        return respuesta;
    }
}