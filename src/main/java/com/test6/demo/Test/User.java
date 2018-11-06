package com.test6.demo.Test;

import javax.persistence.*;

@Entity
@Table(name="user_test")
public class User {

//    @Id
//    @Column(name="first_name")
//    private int id;
    @Id
    @Column(name="first_name", length=10)
    private String firstname;
    @Column(name="last_name", length=10)
    private String lastname;

    public User() {
    }

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
