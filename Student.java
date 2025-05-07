
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    String name;
    HashMap<String, ArrayList<Integer>> Grades;
    Student(String name,HashMap<String, ArrayList<Integer>> Grades){
        this.name=name;
        this.Grades=Grades;
    }
    public void addGrades(String type, ArrayList<Integer> values){
        Grades.put(type, values);
    }
    public HashMap<String, ArrayList<Integer>> getGrades(){
        return Grades;
    }
    public void setName(){
        this.name=name;
    }
}
