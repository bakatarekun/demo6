package demo;

//import com.test6.demo.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) { this.topicService = topicService; }

    //@RequestMapping("/tpc")
//    @RequestMapping( method= RequestMethod.GET, value="/tpc")
//    public String showtopics(Model model){
//
//        model.addAttribute("courses", topicService.getAllTopics());
//        return "index";
//        //return topicService.getAllTopics();
//
//    }
//
//    @Restcontroller returns only content not html and jsp pages.
//    You get only the name because you return only the name return "login";.
//    It's @RestController and this controller returning data rather than a view,
//    because of this, you get only content that you return from method.

    @RequestMapping(method= RequestMethod.GET, value="/tpc")
    public String showindexpage(Model model){


        return "index";
        //return topicService.getAllTopics();

    }
    @RequestMapping(method= RequestMethod.POST, value="/tpc")
    public String showindexpage(Model model,@RequestParam("name1") String name1){

        model.addAttribute("name", name1);
        return "index";
        //return topicService.getAllTopics();

    }



    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopics(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
         topicService.deleteTopic(id);
    }

}
