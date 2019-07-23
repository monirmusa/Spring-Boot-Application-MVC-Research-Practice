package com.example.BusinessMGTSpring.controlier;


import com.example.BusinessMGTSpring.Repository.PersonRipo;
import com.example.BusinessMGTSpring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PersonController {
    @Autowired
   private PersonRipo personRipo;

    //@RequestMapping(method = RequestMethod.POST,value = "addPerson")
    @PostMapping("addPerson")
    @ResponseBody
  public Person addPerson(@RequestBody Person person){
            // by passing varible ,no need person=new......
             //Person person=new Person(1,"Monirujjaman","Dhaka");
           // Person person=new Person(2,"Musa","Dhaka");
           //Person person=new Person(3,"Habiba","Dhaka");
          //Helping By Ni.
        //Name name = new Name("jon","dao");
        //Address address = new Address("12","dhaka","bd","1212");
        //Person person= new Person(6,name,address);
        return   personRipo.save(person);

    }
    //@RequestMapping("persons")
    @GetMapping("person")
    @ResponseBody
    public Iterable<Person> getAllPerson(){
        return personRipo.findAll();
    }


    @PutMapping("updatePerson/{id}")
    @ResponseBody
    public Person updatePerson(@PathVariable int id,@RequestBody Person person){
        return personRipo.save(person);
    }

    @DeleteMapping("deletePerson/{id}")
    @ResponseBody
    public Optional<Person>  deletePersonById(@PathVariable int id ){
        Optional<Person> person = personRipo.findById(id);
        if(person.isPresent()){
            personRipo.deleteById(id);
        }
        return person;

    }

    @DeleteMapping("deletePerson")
    @ResponseBody
    public Optional<Person>  deletePerson(@RequestBody Person person){
        Optional<Person> p= personRipo.findById(person.getId());
        if(p.isPresent()){
            personRipo.delete(person);
        }
        return p;

    }



}
