package com.example.mysqlcoursespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "java app", " java description"),
            new Topic("javascript", "javaScript application", "javaScript Description")


    ));

    public List<Topic> getAllTopics() {

        List<Topic> topics=new ArrayList<>();
     topicRepository.findAll()
             .forEach(topics::add);
     return topics;
    }

    //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();


    }


    public void updateTopic(String id,Topic topic){
        for (int i=0;i<topics.size();i++){

            Topic t=topics.get(i);
            if(t.getId().equals(id))
            { topics.set(i,topic);

                return;
            }


        }

    }

    public void addTopic(Topic topic) {

        topicRepository.save(topic);
    }






    public void deleteTopic(String id){
        topics.removeIf(t-> t.getId().equals(id));



    }





}
