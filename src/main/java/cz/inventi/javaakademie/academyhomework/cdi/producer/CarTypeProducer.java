/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.inventi.javaakademie.academyhomework.cdi.producer;

import cz.inventi.javaakademie.academyhomework.cdi.cartype.CarType;
import cz.inventi.javaakademie.academyhomework.cdi.qualifier.CarTypeList;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ApplicationScoped
public class CarTypeProducer {
    
    
    @Inject
    @Any
    private Instance<CarType> carTypes;
    
    @Produces
    @CarTypeList
    public List<CarType> produceAllCarTypes() {
        List<CarType> types = new LinkedList<>();
        for (CarType carType : carTypes) {
            types.add(carType);
        }
        return types;
    }
    
    
    
}
