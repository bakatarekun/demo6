package com.test6.demo.TasksInputfolder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="taskinputs4")
public class TaskInput {


   // @GeneratedValue
    @Id
    @Column(name="job_id", length=10)
    private int jobid;
    @Column(name="task_id" , length=10)
    private int taskid;
    @Column(name="user_ID", length=10)
    private int userID;
    @Column(name="time_taken", length=10)
    private String  timetaken;

    @Column(name="records_input", length=10)
    private int recordsinput;
    @Column(name="records_output", length=10)
    private int recordsoutput;
    @Column(name="records_dropped", length=10)
    private int recordsdropped;
//    @Column(name="current_time", length=10)
//    private String  currenttime;
    @Column(name="user_note", length=10)
    private String usernote;
    @Column(name="workflow", length=10)
    private int workflow;

    public TaskInput() {

    }

    public TaskInput(int jobid, int taskid, int userID, String timetaken, int recordsinput

                    ,int recordsoutput, int recordsdropped,String usernote, int workflow)//, String currenttime)//, String usernote, int workflow)
    {
        super();
        this.jobid = jobid;
        this.taskid = taskid;
        this.userID = userID;
        this.timetaken = timetaken;
        this.recordsinput = recordsinput;
        this.recordsoutput= recordsoutput;
        this.recordsdropped=recordsdropped;
         //this.currenttime = currenttime;
       this.usernote = usernote;
      this. workflow = workflow;
    }

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getTimetaken() {
        return timetaken;
    }

    public void setTimetaken(String timetaken) {
        this.timetaken = timetaken;
    }

    public int getRecordsinput() {
        return recordsinput;
    }

    public void setRecordsinput(int recordsinput) {
        this.recordsinput = recordsinput;
    }

    public int getRecordsoutput() {
        return recordsoutput;
    }

    public void setRecordsoutput(int recordsoutput) {
        this.recordsoutput = recordsoutput;
    }

    public int getRecordsdropped() {
        return recordsdropped;
    }

    public void setRecordsdropped(int recordsdropped) {
        this.recordsdropped = recordsdropped;
    }

//    public String getCurrenttime() {
//        return currenttime;
//    }
//
//    public void setCurrenttime(String currenttime) {
//        this.currenttime = currenttime;
//    }

    public String getUsernote() {
        return usernote;
    }

    public void setUsernote(String usernote) {
        this.usernote = usernote;
    }
//
    public int getWorkflow() {
        return workflow;
    }

    public void setWorkflow(int workflow) {
        this.workflow = workflow;
    }
}
