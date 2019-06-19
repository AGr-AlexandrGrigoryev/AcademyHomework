/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.inventi.javaakademie.academyhomework.ejb;

import cz.inventi.javaakademie.academyhomework.model.Car;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;


@Singleton
public class CarServiceInMemoryImpl implements CarService{

    private final List<Car> cars =new LinkedList<>();
    
    @PostConstruct
    public void init() {
        
    }
    
    @Override
    public List<Car> getAllCars() {
        return new LinkedList(cars);
    }

    @Override
    public Car getCar(int id) {
        return cars.get(id);
    }

    @Override
    public void save(Car car) {
        synchronized (cars) {
            car.setId(cars.size());
            cars.add(car);
        }
    }
    
}
