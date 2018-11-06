package com.test6.demo;

import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Entity;

@Entity
@Table(name="course")
public class Course {



    @Id
    @Column(name="course_id")
    private String id;
    @Column(name="course_name")
    private String name;
    @Column(name="course_description")
    private String description;

    @ManyToOne
    private Topic topic;

    public Course() {


    }

    public Course(String id, String name, String description, int topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "","");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
