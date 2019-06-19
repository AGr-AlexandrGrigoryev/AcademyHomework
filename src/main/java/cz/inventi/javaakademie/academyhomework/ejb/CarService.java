/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.inventi.javaakademie.academyhomework.ejb;

import cz.inventi.javaakademie.academyhomework.model.Car;
import java.util.List;


public interface CarService {
    
    List<Car> getAllCars();
    
    Car getCar(int id);
    
    void save(Car car);
    
}
