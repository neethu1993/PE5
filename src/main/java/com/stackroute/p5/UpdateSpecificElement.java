/**
 * Program to update specific array element by given element and empty the  array list .
 * Input: [Apple, Grape, Melon, Berry]
 * Output: [Kiwi, Grape, Mango, Berry]
 */
package com.stackroute.p5;

import java.util.Iterator;
import java.util.List;

public class UpdateSpecificElement {

    /*Method to replace the string*/
    public List<String> updateElement(List<String> input,String string1,String string2) {
        int index = 0;
        Iterator<String> iterator = input.iterator();

        //Replacement occurs here
        while (iterator.hasNext()){
            String word = iterator.next();
            if (string1.equals(word)){
                input.set(index,"Kiwi");
            }
            else if(string2.contains(word)){
                input.set(index,"Mango");
            }
            index++;
        }
        return input;
    }

    /*Method to clear the list*/
    public List<String> emptyList(List<String> input) {
        input.clear();
        return input;
    }
}
