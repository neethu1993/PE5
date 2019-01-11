/**
*Maintest class that combines StudentSorter and Student to sort the
*Student objects based on age, name, id.
*/
package com.stackroute.p5;

import java.util.ArrayList;
import java.util.List;

public class Maintest {
    List<Student> studentList = new ArrayList<Student>();
    StudentSorter studentSorter = new StudentSorter();

    /*Method to sort the students*/
    public List<Student> sort(Student[] students, int n) {

        for(int i = 0 ; i < n-1; i++){
            for (int j = i+1; j < n ; j++){

                //Swapping the student objects based on the comparison
                if(studentSorter.compare(students[i],students[j]) < 0){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        // adding the sorted elements to the List
        for(int i=0;i<6;i++) {
            studentList.add(students[i]);
        }
        return studentList;
    }

}
