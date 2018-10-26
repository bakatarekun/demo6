package com.test6.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue
    private int id;
    private int client_id;
    private int  data_mill_ID;

    public Job() {

    }
    public Job(int id, int client_id, int data_mill_ID) {
        super();
        this.id = id;
        this.client_id = client_id;
        this.data_mill_ID = data_mill_ID;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getData_mill_ID() {
        return data_mill_ID;
    }

    public void setData_mill_ID(int data_mill_ID) {
        this.data_mill_ID = data_mill_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
