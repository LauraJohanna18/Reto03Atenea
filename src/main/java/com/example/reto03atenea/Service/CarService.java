package com.example.reto03atenea.Service;

import com.example.reto03atenea.Model.Car;
import com.example.reto03atenea.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Optional<Car> getCar(int id) {
        return carRepository.getCar(id);
    }

    public Car save(Car car) {
        if (car.getIdCar() == null) {
            return carRepository.save(car);

        } else {
            return car;
        }
    }

    public Car update(Car car) {
        if (car.getIdCar() != null) {
            Optional<Car> carEncontrado = getCar(car.getIdCar());
            if (carEncontrado.isPresent()) {
                if (car.getBrand() != null) {
                    carEncontrado.get().setBrand(car.getBrand());
                }
                if (car.getName() != null) {
                    carEncontrado.get().setName(car.getName());

                }

                if (car.getGama() != null) {
                    carEncontrado.get().setGama(car.getGama());
                }
                if (car.getYear() != null) {
                    carEncontrado.get().setYear(car.getYear());

                }

                if (car.getDescription() != null) {
                    carEncontrado.get().setDescription(car.getDescription());
                }
                return carRepository.save(carEncontrado.get());

            } else {
                return car;
            }
        } else {
            return car;
        }
    }

    public boolean deleatedCar(int id) {
        Boolean respuesta = getCar(id).map(car -> {
            carRepository.delate(car);
            return true;
        }).orElse(false);

        return respuesta;
    }
}
