import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
    CSV_reader csvR =new CSV_reader();
    CommonIndexHash CIH =new CommonIndexHash();
    Studentinator s=new Studentinator();
    ArrayList<String> csvOut= new ArrayList<>();
    ArrayList<ArrayList<String>> file=new ArrayList<>();
    csvOut=csvR.readFirstln("Art");
    file=csvR.readFile("Art");
    HashMap<String, ArrayList<Integer>> CIHOut= new HashMap<>();
    CIHOut= CIH.commonHashMapCreator(csvOut);
    ArrayList<Student> Students=new ArrayList<>();
    s.studentsForFile(CIHOut,file);
    }

}
