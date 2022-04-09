package com.example.Liv2Train.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class TrainingCenter{
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String capacity;
    @Column
    private String address;
    @Column
    private String courses;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String date;

    public TrainingCenter(){

    }
    public TrainingCenter(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8){
        id=s1;
        name=s2;
        capacity=s3;
        address=s4;
        courses=s5;
        email=s6;
        phone=s7;
        date=s8;
    }
   public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}