import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int flag;
        if (s1.getAge()>s2.getAge()) {
            flag=1;
        }
        else if (s1.getAge()<s2.getAge()){
            flag=-2;
        }
        else {
            if (s1.getName().compareTo(s2.getName())>1){
                flag = -1;
            }
            else if (s1.getName().compareTo(s2.getName())<1) {
                flag= 2;
            }
            else {
                if (s1.getId()>s2.getId()) {
                    flag= 1;
                }
                else {
                    flag=-2;
                }
            }
        }
        return flag;
    }

}
