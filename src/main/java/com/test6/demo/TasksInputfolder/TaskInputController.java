package com.test6.demo.TasksInputfolder;

//import com.test6.demo.Topic.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

//@RestController
@Controller
public class TaskInputController {

    @Autowired
    private TaskInputService taskService;

    @Autowired
    public TaskInputController(TaskInputService taskService) { this.taskService = taskService;}





    @RequestMapping(method= RequestMethod.GET, value="/taskinputs/displaytaskinputs")
    public String showalltaskinputs(Model model){

        model.addAttribute("taskinputs", taskService.getAllTaskInputs());
        return "displaytaskinputs";
    }

    @RequestMapping(method= RequestMethod.POST, value = "/taskinputs/displaytaskinput")
    public String gettaskinput(@RequestParam("taskinputs") int taskinputs, Model model){
        TaskInput t = taskService.getTaskInput(taskinputs);
        String result  = t.getJobid() + " " + t.getTaskid() + " " + t.getUserID() + ""+ t.getTimetaken();
//
//               + "" + t.getRecords_input() +"" + t.getRecords_output() +"" + t.getRecords_dropped() + "" + t.getCurrent_time() +
//                "" + t.getUser_note() + "" + t.getWorkflow();

        model.addAttribute("taskinput", result);
        return "displaytaskinput";
    }



    @RequestMapping(method= RequestMethod.GET, value="/taskinputs/add")
    public String addTaskinputs(){

        return ("addtaskinput");
    }

    @RequestMapping(method= RequestMethod.POST, value="/taskinputs/add")
    //  @ResponseBody
    // public void addTaskinput(@RequestParam("inputbox") int [] inputboxes, @RequestParam("inputboxstring") String [] inputboxstring )
    public String addTaskinput(Model model, @RequestParam("job_id") int job_id,
                               @RequestParam("task_id") int task_id,
                               @RequestParam("user_ID") int user_id,
                               @RequestParam("time_taken") String time_taken,
                               @RequestParam("records_input") int records_input,
                               @RequestParam("records_output") int records_output,
                               @RequestParam("records_dropped")int records_dropped,
                               // @RequestParam("current_time")String current_time)
                               @RequestParam("user_note")String user_note,
                               @RequestParam("workflow")int workflow)
    {
        TaskInput t =  new TaskInput(job_id, task_id, user_id, time_taken, records_input,records_output,records_dropped,user_note, workflow);//current_time);//,user_note,workflow);
        //  TaskInput t =  new TaskInput(inputboxes[0],inputboxes[1],inputboxes[2],inputboxstring[0],inputboxes[3],inputboxes[4],inputboxes[5],inputboxstring[1],inputboxstring[2],inputboxes[6]);
        taskService.addTaskInput(t);
        //return ("displaytaskinputs");
        model.addAttribute("taskinputs", taskService.getAllTaskInputs());
        return "displaytaskinputs";

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
