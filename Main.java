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
    for(String filename:filenames){
        CSV_reader csvR =new CSV_reader();
        CommonIndexHash CIH =new CommonIndexHash();
        Studentinator s=new Studentinator();
        ArrayList<String> csvOut= new ArrayList<>();
        ArrayList<ArrayList<String>> file=new ArrayList<>();
        AvgGradeCalculator agc = new AvgGradeCalculator();
        csvOut=csvR.readFirstln("Physics");
        file=csvR.readFile("Physics");
        HashMap<String, ArrayList<Integer>> CIHOut= new HashMap<>();
        CIHOut= CIH.commonHashMapCreator(csvOut);
        ArrayList<Student> Students = s.studentsForFile(CIHOut,file);
        for(Student stud:Students){
            stud.putAverage("Physics",agc.GradeAverager(stud.getGrades()));
        }
    }
}
}
