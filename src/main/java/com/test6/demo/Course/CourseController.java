package com.test6.demo.Course;

import com.test6.demo.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){

        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){

        return courseService.getCourse(id);
    }


//    @RequestMapping(method= RequestMethod.POST, value="/topics/{topicId}/courses")
//    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
//        course.setTopic(new Topic(topicId, "","" ));
//        courseService.addCourse(course);
//    }



    @RequestMapping(method= RequestMethod.POST, value="/topics/{topicId}/courses")
    public void addCourse( @RequestParam("course_id") String course_id,
                           @RequestParam("course_name") String course_name,
                           @RequestParam("course_description") String course_description,@PathVariable int topicId)
    {
        Course course = new Course( course_id, course_name, course_description, 0);
        course.setTopic(new Topic(topicId, "","" ));
        courseService.addCourse(course);
    }




    @RequestMapping(method= RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable int topicId, @PathVariable String id){
        course.setTopic(new Topic(topicId, "","" ));
        courseService.updateCourse(course);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }

}
