import java.util.ArrayList;
import java.util.HashMap;

public class Studentinator {
    public ArrayList<Student> studentsForFile(HashMap<String, ArrayList<Integer>> commonIndex, ArrayList<ArrayList<String>> File){
        ArrayList<Student> Students=new ArrayList<>();
        int i=0;
        for(ArrayList<String> StudentToBe:File){
            HashMap<String, ArrayList<Integer>> hm= new HashMap<>();
            Student s = new Student(StudentToBe.get(0), hm);
                for(String key:commonIndex.keySet()){
                    ArrayList<Integer> si=new ArrayList<>();
                    hm.put(key, si);
                    for(Integer indexN:commonIndex.get(key)){
                        ArrayList<Integer> ki= new ArrayList<>();
                        ki=hm.get(key);
                        if(StudentToBe.get(indexN)=="NTI"){
                            StudentToBe.set(indexN, "0");
                        } else if(StudentToBe.get(indexN)=="EXC"){
                            continue;
                        }
                        ki.add(Integer.valueOf(StudentToBe.get(indexN)));
                        hm.replace(key, ki);

                }
            }
            Students.add(s);
        }
        return Students;
    }
}
