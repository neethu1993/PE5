/**
 * Program to implement set interface which sorts the given randomly ordered names in ascending order.
 * Convert the sorted set in to an  array lis
 */
package com.stackroute.p5;

import java.util.*;

public class NameSort {

    /*Method to sort the array of string using set and return as list*/
    ArrayList<String> nameSortMethod(String[] string) {
        Set<String> input = new TreeSet<String>();

        //Adding the string array to TreeSet
        for (String s:string) {
            input.add(s);
        }
        ArrayList<String> output = new ArrayList<>();
        Iterator<String> iterator = input.iterator();

        //Converting the set to array list using iterator
       while(iterator.hasNext()){
        output.add(iterator.next());
        }
        return output;
    }
}