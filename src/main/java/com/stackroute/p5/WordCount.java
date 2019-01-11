/**
 * Program to find the number of counts in the following  String .
 * Store the output in Map< String ,Integer> as key value pair.
 */
package com.stackroute.p5;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    /*Method to count the alphabetic strings*/
    public Map<String,Integer> wordCount(String str) {
        int count;

        //Stores the alphabetic strings to array
        String[] words = str.split("\\W|\\_|\\d");
        Map<String,Integer> wordCount = new HashMap<String,Integer>();

        //Counting of words occurs here
        for (int i=0;i<words.length;i++) {
            count=0;
            for(int j=0;j<words.length;j++) {
                if(words[i].equals(words[j]) && !words[i].equals(" ")) {
                    count++;
                }
                wordCount.put(words[i],count);
            }
        }
        wordCount.remove("");
        return wordCount;
    }
}
