package com.test6.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TopicService {

  @Autowired
  private TopicRepository topicRepository;

  private   List<Topic> topics =  new ArrayList<>(Arrays.asList(

      ));

  public List<Topic> getAllTopics(){
      //return topics;
      List<Topic> topics = new ArrayList<>();
      topicRepository.findAll().forEach(topics::add);
      return topics;
  }

    public List<Topic> getAllTopicsById(){

        List<Topic> topics = new ArrayList<>();
        List<Integer> topics2 = new ArrayList<>();
        topics2.add(3);
        topics2.add(4);
        Iterable<Integer> iterable = topics2;
        topicRepository.findAllById(iterable).forEach(topics::add);
        return topics;
    }

  public Topic getTopics(int id){

      //return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
      Topic t = topicRepository.findById(id).get();
     return t;
  }

//    public List getTopics(String id){
//        List<Topic> topicList = new ArrayList<>();
//        //return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
//        topicList.add(topicRepository.findById(id).get());
//        return topicList;
//    }


    public void addTopic(Topic topic){

     topicRepository.save(topic);
   }

    public void updateTopic(String id, Topic topic){
//        for (int i =0; i< topics.size(); i++){
//            if (topic.getId().equals(id)){
//                topics.set(i,topic);
//                return ;
//            }
//        }

        topicRepository.save(topic);
    }

    public void deleteTopic(int id){

      //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }

}
