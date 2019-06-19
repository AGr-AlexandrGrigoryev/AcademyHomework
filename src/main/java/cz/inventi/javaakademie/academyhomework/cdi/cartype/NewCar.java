package cz.inventi.javaakademie.academyhomework.cdi.cartype;

import cz.inventi.javaakademie.academyhomework.cdi.qualifier.NewCarQualifier;

import javax.inject.Named;


@Named
@NewCarQualifier
public class NewCar implements CarType {
    @Override
    public String getName() {
        return "NewCar";
    }

    @Override
    public int getVersion() {
        return 2;
    }

    @Override
    public String toString() {
        return getName() + " version # " + getVersion();
    }
}
