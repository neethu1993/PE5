/**
 * This contains a class of student with its private variables and getters and setters
 */
package com.stackroute.p5;

public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    /*Parameterized Constructer*/
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /*Getters and setters*/
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
        if(age>=5 && age<=100) {
            this.age = age;
        }
    }

    /* Overridden toString method*/
    @Override
    public String toString() {
        return "com.stackroute.p5.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
