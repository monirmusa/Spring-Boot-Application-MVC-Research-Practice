package com.example.springJava;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
           new Topic("1","Toyota Corrolla","Musa","Mohakhali to gulsan" ,500,200,40)
           // new Topic("2","Toyota Corrolla","Musa","Mohakhali to gulsan",500,200,40),
           // new Topic("3","Toyota Corrolla","Musa","Mohakhali to gulsan",500,200,40)


    ));

    public List<Topic> getAllTopics() {
        return topics;
    }
     //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    public Topic getTopic(String id) {
        Topic topic = topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
         if (topic==null){
             throw new ProductNotfoundException();
         }
         return topic;

    }


    public void updateTopic(String id,Topic topic){
        for (int i=0;i<topics.size();i++){

        Topic t=topics.get(i);
         if(t.getId().equals(id))
         { topics.set(i,topic);

         return;}
         else if (!t.getId().equals(id))
        {      throw new ProductNotfoundException(); }
            // ResponseEntity.notFound().build();}

        }

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }






    public void deleteTopic(String id){
        topics.removeIf(t-> t.getId().equals(id));



    }





}