package com.example.springJava;

//import ExceptionHandle1.CarNotfoundException;
import ModelClass.Car;
import com.in28minutes.springboot.rest.example.student.CarNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<>(Arrays.asList(
           new Car("1","Toyota Corrolla","Musa","Mohakhali to gulsan" ,500,200,40)
           // new Car("2","Toyota Corrolla","Musa","Mohakhali to gulsan",500,200,40),
           // new Car("3","Toyota Corrolla","Musa","Mohakhali to gulsan",500,200,40)


    ));

    public List<Car> getAllCar() {

        return cars;
    }
     //return cars.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    public Car getCar(String id) {
        Car car = cars.stream().filter(t -> t.getId().equals(id)).findFirst().get();
         if (car ==null){
             throw new CarNotFoundException(" Not found the car Id: -" + id);
         }
         return car;

    }


    public void updateCar(String id, Car car){
        for (int i = 0; i< cars.size(); i++){

        Car t= cars.get(i);
         if(t.getId().equals(id))
         { cars.set(i, car);

         return;
         }
         else if (!t.getId().equals(id))
        {      throw new CarNotFoundException("Not found the car id-" + id); }
            // ResponseEntity.notFound().build();}

        }

    }

    public void addCar(Car car) {
        cars.add(car);
    }



    public void deleteCar(String id){
        cars.removeIf(t-> t.getId().equals(id));



    //public String deleteCar(String id){
      //  cars.removeIf(t-> t.getId().equals(id));
        //return "Deleated";



    }





}