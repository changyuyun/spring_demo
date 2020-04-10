package com.ityun.domain;

public class Factory {
    private int id;
    private int age;
    private String name;
    private String work;

    public Factory() {
    }

    public Factory(int id, int age, String name, String work) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
