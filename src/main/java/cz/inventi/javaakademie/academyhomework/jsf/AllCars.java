/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.inventi.javaakademie.academyhomework.jsf;

import javax.inject.Inject;
import javax.inject.Named;
import cz.inventi.javaakademie.academyhomework.ejb.CarService;
import cz.inventi.javaakademie.academyhomework.model.Car;
import java.util.List;

@Named
public class AllCars {
    
    @Inject
    private CarService carsService;


    public List<Car> getCars() {
        return carsService.getAllCars();
    }
    
}
