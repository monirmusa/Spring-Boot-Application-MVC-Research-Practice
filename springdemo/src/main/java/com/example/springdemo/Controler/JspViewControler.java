package com.example.springdemo.Controler;

import com.example.springdemo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("jspViews")
public class JspViewControler {
    @RequestMapping("index")
    public ModelAndView showIndex(){


        Person person1=new Person(1,"jon dow","Dhaka");
        Person person2=new Person(2,"Alex","Dhaka");
        Person person3=new Person(3,"jack ","Dhaka");
         List<Person> personList=new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        String name="musa";
  ModelAndView modelAndView=new ModelAndView("index");

   modelAndView.addObject("name",name);
   modelAndView.addObject("personList",personList);

    return modelAndView;
    }

}
