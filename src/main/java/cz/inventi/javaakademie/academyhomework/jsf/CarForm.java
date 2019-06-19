package cz.inventi.javaakademie.academyhomework.jsf;

import cz.inventi.javaakademie.academyhomework.cdi.cartype.CarType;
import cz.inventi.javaakademie.academyhomework.cdi.qualifier.CarTypeList;
import cz.inventi.javaakademie.academyhomework.model.Car;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Size;
import cz.inventi.javaakademie.academyhomework.ejb.CarService;


@Named
@RequestScoped
public class CarForm {
    
    private Car car;
    
    @Inject
    @CarTypeList
    private List<CarType> carTypes;
    
    @Inject
    private CarService carsService;
    
    @PostConstruct
    public void init() {
        car = new Car();
    }
    
    public String saveCar() {
        System.out.println(car.getSpz());
        System.out.println(car.getType());
        carsService.save(car);
        return "allcars";
    }

    @Size(min = 4)
    public String getSpz() {
        return car.getSpz();
    }
    
    public void setSpz(String spz) {
        car.setSpz(spz);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public String getCarType() {
        return car.getType();
    }
    
    public void setCarType(String type) {
        car.setType(type);
    }

    public List<CarType> getCarTypes() {
        return carTypes;
    }

    public void setCarTypes(List<CarType> carTypes) {
        this.carTypes = carTypes;
    }
    
    public int getYear() {
        return car.getYear();
    }
    
    public void setYear(int year) {
        car.setYear(year);
    }
    
}
