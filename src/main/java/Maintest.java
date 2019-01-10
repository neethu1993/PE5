import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Maintest {
    List<Student> ar = new ArrayList<Student>();
    StudentSorter ss = new StudentSorter();
    public List<Student> sort(Student[] s,int n) {


        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(ss.compare(s[i],s[j])<0){
                    Student temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        for(int i=0;i<6;i++) {
            ar.add(s[i]);
        }
        return ar;
    }

}
