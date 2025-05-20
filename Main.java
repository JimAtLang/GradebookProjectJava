import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        new Main();
    }

    public Main(){
        CSV_reader csvr = new CSV_reader();
        ArrayList<String> firstLineArt = csvr.readFirstln("Art");
        ArrayList<ArrayList<String>> gradeListArt = csvr.readFile("Art");
        String firstStudentName = gradeListArt.get(0).get(0);
        Student firStudent = new Student(firstStudentName, null)
    }
}
