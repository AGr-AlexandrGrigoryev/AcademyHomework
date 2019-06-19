package cz.inventi.javaakademie.academyhomework.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import cz.inventi.javaakademie.academyhomework.ejb.CarService;
import cz.inventi.javaakademie.academyhomework.model.Car;


@Path("/cars")
public class CarsResource {

    @Context
    private UriInfo uri;

    @Inject
    private CarService carService;

    @Path("/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @Path("/")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCar(Car car) {
        carService.save(car);
        return Response.created(URI.create(uri.getPath() + "/" + car.getId())).build();
    }

    //    doplnte ziskani jednoho auto s id, kde path bude "/{id}" , kde id je car.getId()
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCar(@PathParam("id") int id) {
        Car car = carService.getCar(id);
        return Response.ok().entity(car).build();
    }

}
