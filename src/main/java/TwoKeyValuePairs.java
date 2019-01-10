import java.util.*;

public class TwoKeyValuePairs {
    public Map<String,String> twoKeyValueMethod(Map<String,String> inputMap) {
        Iterator<Map.Entry<String,String>> it = inputMap.entrySet().iterator();
        String keyValue= "";
        String valueMap = "";
        Boolean flag = false;
        if (!it.hasNext())
            return null;
        while(it.hasNext()) {
            Map.Entry<String,String> thisEntry = it.next();
            keyValue = thisEntry.getKey();
            if(flag == false && keyValue!=null) {
                valueMap = thisEntry.getValue();
                inputMap.put(keyValue," ");
                flag = true;
            }
            else if (flag == true && keyValue!=null) {
                inputMap.put(keyValue,valueMap);
            }
        }
        return inputMap;
    }

//    public static void main(String[] args) {
//        TwoKeyValuePairs t =new TwoKeyValuePairs();
//
//    }
}
