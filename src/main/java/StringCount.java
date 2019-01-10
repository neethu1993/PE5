import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public Map<String,Boolean> stringCountMethod(String[] str) {
        //String[] words = str.split("\\W|\\_|\\d");
        Map<String,Boolean> wordCount = new HashMap<String,Boolean>();
        int count;
        for (int i=0;i<str.length;i++) {

            count=0;
            for(int j=0;j<str.length;j++) {
                if(str[i].equals(str[j])) {
                    //System.out.println(words[i]);
                    count++;
                }
                if(count>1) {
                    wordCount.put(str[i],true );
                }
                else {
                    wordCount.put(str[i],false);
                }
            }
        }
        //wordCount.remove("");
        //System.out.println(wordCount);
        return wordCount;
    }
}
