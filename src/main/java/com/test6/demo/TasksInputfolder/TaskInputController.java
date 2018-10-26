package com.test6.demo.TasksInputfolder;

//import com.test6.demo.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

//@RestController
@Controller
public class TaskInputController {

    @Autowired
    private TaskInputService taskService;

    @Autowired
    public TaskInputController(TaskInputService jobService) { this.taskService = taskService;}





    @RequestMapping("/taskinputs/displaytaskinputs")
    public String showalljobs(Model model){

        model.addAttribute("taskinputs", taskService.getAllTaskInputs());
        return "displaytaskinputs";
    }

    @RequestMapping(method= RequestMethod.POST, value = "/taskinputs/displaytask")
    public String getJob(@RequestParam("taskinputs") int taskinputs, Model model){
        TaskInput t = taskService.getTaskInput(taskinputs);
        String result  = t.getJob_id() + " " + t.getTask_id() + " " + t.getUser_ID() + ""+ t.getTime_taken() +
                "" + t.getRecords_input() +"" + t.getRecords_output() +"" + t.getRecords_dropped() + "" + t.getCurrent_time() +
                "" + t.getUser_note() + "" + t.getWorkflow();

        model.addAttribute("job", result);
        return "displaytaskinputs";
    }



    @RequestMapping(method= RequestMethod.GET, value="/taskinputs/add")
    public String addTaskinputs(){

        return ("addtaskinputs");
    }

    @RequestMapping(method= RequestMethod.POST, value="/taskinputs/add")
    public void addTaskinput(@RequestParam("job_id") int job_id,
                             @RequestParam("task_id") int task_id,
                             @RequestParam("user_ID") int user_ID,
                             @RequestParam("time_taken") Date time_taken,
                             @RequestParam("records_input") int records_input,
                             @RequestParam("records_output") int records_output,

                             @RequestParam("records_dropped")int records_dropped,
                             @RequestParam("current_time")Date current_time,
                             @RequestParam("user_note")String user_note,
                             @RequestParam("workflow")int workflow)
    {
        TaskInput t =  new TaskInput(job_id, task_id, user_ID,time_taken,records_input,records_output,records_dropped,current_time,user_note,workflow);
        taskService.addTaskInput(t);


    }

    @RequestMapping(method= RequestMethod.PUT, value="/taskinputs/{id}")
    public void updatetaskinput(@RequestBody TaskInput taskinput, @PathVariable int id){
        taskService.updateTaskInput(id, taskinput);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/taskinputs/{id}")
    public void deletetaskinput(@PathVariable int id){
        taskService.deleteTaskInput(id);
    }

}
