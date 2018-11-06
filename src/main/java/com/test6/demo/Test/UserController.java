package com.test6.demo.Test;


import com.test6.demo.Topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserService userService) { this.userService = userService;}

    @PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String createUser(@RequestBody User user)
    {

        userService.addUser(user);

        return "user was created";
    }


    @RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

}
