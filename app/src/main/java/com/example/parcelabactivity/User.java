package com.example.parcelabactivity;

import org.parceler.Parcel;

import java.io.Serializable;

@Parcel
public class User implements Serializable {
    String name;
    String age;

    public User(){}

    public User(String name, String age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
