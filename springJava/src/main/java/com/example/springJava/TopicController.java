package com.example.springJava;

import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

  @Autowired
    private TopicService topicService;

    @RequestMapping("/cars")
    public List<Topic>getAllTopic(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/cars/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);

    }

    @RequestMapping(method = RequestMethod.POST,value = "/cars")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }



    @RequestMapping(method = RequestMethod.PUT,value = "/cars/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)

    {
        topicService.updateTopic(id,topic);
    }



    @RequestMapping(method = RequestMethod.DELETE,value = "/cars/{id}")
    public void deleteTopic(@PathVariable String id){
         topicService.deleteTopic(id);

    }


}
