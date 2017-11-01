package com.ly.model;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by cilu on 2017/10/31.
 */
@Table(name = "person")
public class Person {
    @Id
    private int id;
    private String name;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
