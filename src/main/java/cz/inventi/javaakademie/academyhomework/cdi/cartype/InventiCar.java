package cz.inventi.javaakademie.academyhomework.cdi.cartype;

import javax.inject.Named;

import cz.inventi.javaakademie.academyhomework.cdi.qualifier.InventiCarQualifier;


@Named
@InventiCarQualifier
public class InventiCar implements CarType{

    @Override
    public String getName() {
        return "InventiCar";
    }

    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public String toString() {
        return getName() + " : " + getVersion();
    }

    
}
