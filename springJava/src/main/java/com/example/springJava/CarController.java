package com.example.springJava;

import ModelClass.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

  @Autowired
    private CarService carService;

    @RequestMapping("/cars")
    public List<Car> getAllCar(){
        return carService.getAllCar();
    }

    @RequestMapping("/cars/{id}")
    public Car getTopic(@PathVariable String id){
        return carService.getCar(id);

    }

    @RequestMapping(method = RequestMethod.POST,value = "/cars")
    public void addTopic(@RequestBody Car car){

        carService.addCar(car);
    }



    @RequestMapping(method = RequestMethod.PUT,value = "/cars/{id}")
    public void updateTopic(@RequestBody Car car, @PathVariable String id)

    {

        carService.updateCar(id, car);
    }



    @RequestMapping(method = RequestMethod.DELETE,value = "/cars/{id}")
    public void deleteTopic(@PathVariable String id){
         carService.deleteCar(id);

    }


}
