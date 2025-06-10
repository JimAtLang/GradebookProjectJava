import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
    String[] filenames = {"Algebra 1","Algebra 2",
        "American History","Art","Biology","Calculus",
        "Chemistry","Coding","Earth Science","French 1","French 2",
        "Geometry","Music","Physics","Pre-Calculus","Sign Language",
        "Social Studies","Spanish 1","Spanish 2","Wood Shop","World History"
    };
    HashMap<String,Student> allStudents = new HashMap<>();
    for(String filename:filenames){
        CSV_reader csvR =new CSV_reader();
        CommonIndexHash CIH =new CommonIndexHash();
        Studentinator s=new Studentinator();
        ArrayList<String> csvOut= new ArrayList<>();
        ArrayList<ArrayList<String>> file=new ArrayList<>();
        AvgGradeCalculator agc = new AvgGradeCalculator();
        csvOut=csvR.readFirstln(filename);
        file=csvR.readFile(filename);
        HashMap<String, ArrayList<Integer>> CIHOut= new HashMap<>();
        CIHOut= CIH.commonHashMapCreator(csvOut);
        ArrayList<Student> Students = s.studentsForFile(CIHOut,file);
        for(Student stud:Students){
            if(allStudents.containsKey(stud.getName())){
                allStudents.get(stud.getName()).putAverage(filename, agc.GradeAverager(stud.getGrades()));
            } else {
                stud.putAverage(filename,agc.GradeAverager(stud.getGrades()));
                allStudents.put(stud.getName(), stud);
            }
            
        }
    }
    for(Student s:allStudents.values()){
        s.printAverages();
        System.out.println("-----------------------");
    }
}
}
