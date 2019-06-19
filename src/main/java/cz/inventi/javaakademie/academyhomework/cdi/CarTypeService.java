package cz.inventi.javaakademie.academyhomework.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import cz.inventi.javaakademie.academyhomework.cdi.cartype.CarType;
import cz.inventi.javaakademie.academyhomework.cdi.qualifier.InventiCarQualifier;
import cz.inventi.javaakademie.academyhomework.cdi.qualifier.NewCarQualifier;


@Named
public class CarTypeService {
    
    
    @Inject
    @InventiCarQualifier
    private CarType inventiCar;

    @Inject
    @NewCarQualifier
    private CarType otherCar;
    

    public CarType getInventiCar(){
        return inventiCar;
    }
    
    public CarType getOtherCar() {
        return otherCar;
    }
    
}
