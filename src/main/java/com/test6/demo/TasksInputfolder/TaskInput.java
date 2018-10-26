package com.test6.demo.TasksInputfolder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TaskInput {

    @Id
    @GeneratedValue
    private int job_id;
    private int task_id;
    private int user_ID;
    private Date  time_taken;
    private int records_input;
    private int records_output;
    private int records_dropped;
    private Date  current_time;
    private String user_note;
    private int workflow;

    public TaskInput() {

    }
    public TaskInput(int job_id, int task_id, int user_ID, Date time_taken, int records_input,
                     int records_output, int records_dropped, Date current_time, String user_note, int workflow)
    {
        super();
        this.job_id = job_id;
        this.task_id = task_id;
        this.user_ID = user_ID;
        this.time_taken = time_taken;
        this.records_input = records_input;
        this.records_output= records_output;
        this.records_dropped=records_dropped;
        this.current_time = current_time;
        this.user_note = user_note;
        this. workflow = workflow;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public Date getTime_taken() {
        return time_taken;
    }

    public void setTime_taken(Date time_taken) {
        this.time_taken = time_taken;
    }

    public int getRecords_input() {
        return records_input;
    }

    public void setRecords_input(int records_input) {
        this.records_input = records_input;
    }

    public int getRecords_output() {
        return records_output;
    }

    public void setRecords_output(int records_output) {
        this.records_output = records_output;
    }

    public int getRecords_dropped() {
        return records_dropped;
    }

    public void setRecords_dropped(int records_dropped) {
        this.records_dropped = records_dropped;
    }

    public Date getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(Date current_time) {
        this.current_time = current_time;
    }

    public String getUser_note() {
        return user_note;
    }

    public void setUser_note(String user_note) {
        this.user_note = user_note;
    }

    public int getWorkflow() {
        return workflow;
    }

    public void setWorkflow(int workflow) {
        this.workflow = workflow;
    }
}
