import java.util.ArrayList;
import java.util.HashMap;
//si is student Index, ki is keyIndex,
public class Studentinator {
    public ArrayList<Student> studentsForFile(HashMap<String, ArrayList<Integer>> commonIndex, ArrayList<ArrayList<String>> File){
        ArrayList<Student> Students=new ArrayList<>();
        for(ArrayList<String> StudentToBe:File){
            HashMap<String, ArrayList<Integer>> hm= new HashMap<>();
            Student s = new Student(StudentToBe.get(0), hm);
                for(String key:commonIndex.keySet()){
                    ArrayList<Integer> si=new ArrayList<>();
                    hm.put(key, si);
                    System.out.println(commonIndex.get(key));
                    ArrayList<Integer> ki= new ArrayList<>();                    
                    for(Integer indexN:commonIndex.get(key)){

                        if(StudentToBe.get(indexN).equals("NTI")){
                            StudentToBe.set(indexN, "0");
                        } else if(StudentToBe.get(indexN).equals("EXC")){
                            continue;
                        }
                        ki.add(Integer.valueOf(StudentToBe.get(indexN)));
                        hm.replace(key, ki);
                }
                s.setGrades(hm);
            }
            Students.add(s);
        }
        return Students;
    }
}
