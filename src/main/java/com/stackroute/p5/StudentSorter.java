/**
 * Program contains the class that implements Comparator and overrides compare method,
 * based on variables in Student class
 */
package com.stackroute.p5;

import com.stackroute.p5.Student;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    /*Overridden compare method*/
    @Override
    public int compare(Student student1, Student student2) {
        int flag;

        //Checks whether the age of the students are equal or not
        if (student1.getAge()>student2.getAge()) {
            flag=1;
        }
        else if (student1.getAge()<student2.getAge()){
            flag=-2;
        }
        else {

            //Checks the names are same or not
            if (student1.getName().compareTo(student2.getName())>1){
                flag = -1;
            }
            else if (student1.getName().compareTo(student2.getName())<1) {
                flag= 2;
            }
            else {

                //Compares with student id
                if (student1.getId()>student2.getId()) {
                    flag= 1;
                }
                else {
                    flag=-2;
                }
            }
        }
        return flag;
    }

}
