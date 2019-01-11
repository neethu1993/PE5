/**
 * Program contains the class that implements Comparator and overrides compare method,
 * based on variables in Student class
 */
package com.stackroute.p5;

public class StudentSorter extends Student implements Comparable<Student> {

    StudentSorter(int id,String name, int age) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }

    /*Overridden compareTo method*/
    @Override
    public int compareTo(Student student) {
        if ((this.getAge()-student.getAge())==0) {
            if(this.getName().equals(student.getName())){
                return student.getId()-this.getId();
            }
            else
                return this.getName().compareTo(student.getName());
        }
        else
            return student.getAge()-this.getAge();
    }
}
