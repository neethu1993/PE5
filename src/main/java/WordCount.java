import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String,Integer> wordCount(String str) {
        String[] words = str.split("\\W|\\_|\\d");
        Map<String,Integer> wordCount = new HashMap<String,Integer>();
        int count;
        for (int i=0;i<words.length;i++) {

            count=0;
            for(int j=0;j<words.length;j++) {
                if(words[i].equals(words[j]) && !words[i].equals(" ")) {
                    //System.out.println(words[i]);
                    count++;
                }
                wordCount.put(words[i],count);
            }
        }
        wordCount.remove("");
        System.out.println(wordCount);
        return wordCount;
    }
}
