package com.example.springdemo.Controler;

import com.example.springdemo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("personViews")
public class SpringDemoController {


   @RequestMapping("sayHallow")
   @ResponseBody
    public String sayHallow(){
        return "I love you";
    }


    @RequestMapping("person")
    @ResponseBody
    public Person showPerson(){
       Person person=new Person(1,"jon dow","Dhaka");
        return person;
    }


    public static List<Person> PersonList=new ArrayList<>();


   @RequestMapping("persons")
    @ResponseBody
    public List<Person>  showAllPerson(){
        Person person1=new Person(1,"jon dow","Dhaka");
        Person person2=new Person(2,"Alex","Dhaka");
        Person person3=new Person(3,"jack ","Dhaka");

        PersonList.add(person1);
        PersonList.add(person2);
        PersonList.add(person3);
        return PersonList;
    }

    @RequestMapping("name/{name}")
    @ResponseBody
    public  String myname(@PathVariable String name){
       return  name;
    }



    @RequestMapping("man/{id}")
    @ResponseBody
    public  Person showPerticularPerson(@PathVariable int id){
        Person person= new Person();
        for(Person p:PersonList)
        {
            if(p.getId()==id){
                person=p;
                break;
                }
        }
        return person;
    }
}
