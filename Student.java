
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, ArrayList<Integer>> Grades;
    Student(String name,HashMap<String, ArrayList<Integer>> Grades){
        this.name=name;
        Grades= new HashMap<>();
    }
    public void addGradesList(String type, ArrayList<Integer> values){
        Grades.put(type, values);
    }
    public HashMap<String, ArrayList<Integer>> getGrades(){
        return Grades;
    }
    public void addGrade(String type, int grade, ArrayList<Integer> gradesList){
        gradesList.add(grade);
        Grades.replace(type, gradesList);
    }
    public void setName(String s){
        this.name=s;
    }
    public String getName(){
        return name;
    }
}
