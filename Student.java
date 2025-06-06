
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, ArrayList<Integer>> Grades;
    private HashMap<String, Integer> averages;
    public void setGrades(HashMap<String, ArrayList<Integer>> grades) {
        Grades = grades;
    }
    public Student(String name,HashMap<String, ArrayList<Integer>> Grades){
        this.name=name;
        Grades= new HashMap<>();
        averages = new HashMap<>();
    }
    public void putAverage(String s, int i){
        averages.put(s, i);
    }
    public void addGradesList(String type, ArrayList<Integer> values){
        Grades.put(type, values);
    }
    public HashMap<String, ArrayList<Integer>> getGrades(){
        return Grades;
    }
    public void addGrade(String type, int grade){
        if(Grades.containsKey(type)){ // need to add a null check? 
        ArrayList<Integer> gradesList=Grades.get(type);
        gradesList.add(grade);
        Grades.replace(type, gradesList);            
        } else{
            ArrayList<Integer> gradesList=null;
            gradesList.add(grade);
            Grades.put(type, gradesList);
        }

    }
    public void setName(String s){
        this.name=s;
    }
    public String getName(){
        return name;
    }
    public void printAverages(){
        System.out.println(name);
        for(String subject:averages.keySet()){
            System.out.println(subject+": "+averages.get(subject));
        }
    }
}
