import java.util.*;

public class NameSort {
    ArrayList<String> nameSortMethod(String[] string) {
        Set<String> input = new TreeSet<String>();
        for (String s:string) {
            input.add(s);
        }

        ArrayList<String> output = new ArrayList<>();
        Iterator<String> it = input.iterator();
       while(it.hasNext()){
        output.add(it.next());
        }
        return output;
    }

//    public static void main(String[] args) {
//        NameSort nameSort = new NameSort();
//        String[] input = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
//        System.out.println(nameSort.nameSortMethod(input));
//    }
}