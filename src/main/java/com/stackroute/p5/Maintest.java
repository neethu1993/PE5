/**
*Maintest class that combines StudentSorter and Student to sort the
*Student objects based on age, name, id.
*/
package com.stackroute.p5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maintest{

    /*Method to sort the students*/
    public ArrayList<StudentSorter> sorting(ArrayList<StudentSorter> studentSorters) {

        //Sorting
        Collections.sort(studentSorters);
        return studentSorters;
    }
}
