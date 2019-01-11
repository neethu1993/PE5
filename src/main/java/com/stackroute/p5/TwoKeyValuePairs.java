/**
 * A method that accepts a Map object having two key-value pairs with the keys val1 and val2.
 * Modify and return the given map as follows:
 * a. If the key `val1` has a value, set the key `val2` to have that value, and
 * b. Set the key `val1` to have the value `"  "` (empty string ).
 */

package com.stackroute.p5;

import java.util.*;

public class TwoKeyValuePairs {

    /*Method to perform the values in the map*/
    public Map<String,String> twoKeyValueMethod(Map<String,String> inputMap) {
        Iterator<Map.Entry<String,String>> iterator = inputMap.entrySet().iterator();
        String keyValue= "";
        String valueMap = "";
        Boolean flag = false;
        if (!iterator.hasNext())
            return null;

        //Rearrangement of the values occurs here
        while(iterator.hasNext()) {
            Map.Entry<String,String> thisEntry = iterator.next();
            keyValue = thisEntry.getKey();

            //Checks for the first key, value pair and performs rearrangement
            if(flag == false && keyValue!=null) {
                valueMap = thisEntry.getValue();
                inputMap.put(keyValue," ");
                flag = true;
            }

            //Checks for the second key, value pair and performs rearrangement
            else if (flag == true && keyValue!=null) {
                inputMap.put(keyValue,valueMap);
            }
        }
        return inputMap;
    }
}
