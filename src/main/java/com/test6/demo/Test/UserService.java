package com.test6.demo.Test;

import com.test6.demo.Topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){

        userRepository.save(user);
    }

    public void updateUser(String id, User user){
//        for (int i =0; i< topics.size(); i++){
//            if (topic.getId().equals(id)){
//                topics.set(i,topic);
//                return ;
//            }
//        }

        userRepository.save(user);
    }

    public void deleteUser(String id){

        //topics.removeIf(t -> t.getId().equals(id));
        userRepository.deleteById(id);
    }
}
