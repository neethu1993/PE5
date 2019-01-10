import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateSpecificElement {
    public List<String> updateElement(List<String> input,String string1,String string2) {
        int index = 0;
        Iterator<String> it = input.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (string1.equals(s)){
                input.set(index,"Kiwi");
            }
            else if(string2.contains(s)){
                input.set(index,"Mango");
            }
            index++;
        }
        return input;
    }

    public List<String> emptyList(List<String> input) {
        input.clear();
        return input;
    }
}
