package com.chen.app.dao;

import java.util.Arrays;

public class StudentDto {
    private Integer id;
    private String uname;

    private String home;

    private String[] hobby;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", home='" + home + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
