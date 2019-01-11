/**
 * Program where an array of strings is input and output is a Map< String ,boolean>,
 * where each different string is a key and its value is true,
 * if that string appears 2 or more times in the array.
 */
package com.stackroute.p5;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

    /*Method to find the value is greater than 1 or not*/
    public Map<String,Boolean> stringCountMethod(String[] str) {
        Map<String,Boolean> wordCount = new HashMap<String,Boolean>();
        int count;
        for (int i=0;i<str.length;i++) {
            count=0;

            //Calculates the count of each value
            for(int j=0;j<str.length;j++) {
                if(str[i].equals(str[j])) {
                    count++;
                }

                //Checks whether the value occurs more than once or not
                if(count>1) {
                    wordCount.put(str[i],true );
                }
                else {
                    wordCount.put(str[i],false);
                }
            }
        }
        return wordCount;
    }
}
