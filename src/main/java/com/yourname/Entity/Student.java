package com.yourname.Entity;

import java.util.HashMap;

/**
 * Created by jroh on 12/09/2016.
 */
public class Student {

    private int id;
    private String name;
    private String course;
    private HashMap<String, String> extraInfo;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.extraInfo = new HashMap<String, String>();
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public HashMap<String, String> getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(HashMap<String, String> extraInfo) {
        this.extraInfo = extraInfo;
    }

}
