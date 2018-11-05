package com.test6.demo.TasksInputfolder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskInputService {

    @Autowired
    private TaskInputRepository taskInputRepository;

    private   List<TaskInput> taskinput =  new ArrayList<>(Arrays.asList(
//          new TaskInput(1,1,1 ),
//          new TaskInput(2,2,2 ),
//          new TaskInput(3,3,3 )
    ));

    public List<TaskInput> getAllTaskInputs(){

        List<TaskInput> taskinputs = new ArrayList<>();
        taskInputRepository.findAll().forEach(taskinputs::add);
        return taskinputs;
    }


    public TaskInput getTaskInput(int id){


        TaskInput t = taskInputRepository.findById(String.valueOf(id)).get();
        return t;
    }



    public void addTaskInput(TaskInput taskinput){

        taskInputRepository.save(taskinput);
    }

    public void updateTaskInput(int id, TaskInput taskinput){


        taskInputRepository.save(taskinput);
    }

    public void deleteTaskInput(int id){


        taskInputRepository.deleteById(String.valueOf(id));
    }

}
