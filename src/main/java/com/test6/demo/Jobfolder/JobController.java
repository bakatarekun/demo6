package com.test6.demo.Jobfolder;

//import com.test6.demo.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) { this.jobService = jobService;}


    @RequestMapping(method= RequestMethod.GET, value="/topics/add/courses")
    public String addcourse()

    {
        return "createcourse";
    }


    @RequestMapping("/jobs/displayjobs")
    public String showalljobs(Model model){

        model.addAttribute("jobs", jobService.getAllJobs());
        return "displayjobs";
    }

    @RequestMapping(method= RequestMethod.POST, value = "/jobs/displayjob")
    public String getJob(@RequestParam("job") int job, Model model){
        Job t = jobService.getJobs(job);
        String result  = t.getId() + " " + t.getClient_id() + " " + t.getData_mill_ID();

        model.addAttribute("job", result);
        return "displayjob";
    }

    @RequestMapping(method= RequestMethod.GET, value="/ajaxtest")
    public String addCourse(){

        return ("AjaxTest");
    }
    @RequestMapping(method= RequestMethod.POST, value="/testjson/add")
    public String addCourse2(Model model, @RequestParam("course_id") String str ){

       model.addAttribute("result", str);
        return ("testjson2");
    }



    @RequestMapping(method= RequestMethod.GET, value="/jobs/add")
    public String addJob(){

        return ("addjob");
    }

    @RequestMapping(method= RequestMethod.POST, value="/jobs/add")
    public void addJob(@RequestParam("id") int id,@RequestParam("client_id") int client_id,@RequestParam("data_mill_id") int data_mill_id){
        Job t =  new Job(id, client_id, data_mill_id);
        jobService.addJob(t);


    }

    @RequestMapping(method= RequestMethod.PUT, value="/jobs/{id}")
    public void updateJob(@RequestBody Job job, @PathVariable int id){
        jobService.updateJob(id, job);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/jobs/{id}")
    public void deleteJob(@PathVariable int id){
        jobService.deleteJob(id);
    }

}
