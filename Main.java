import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
    csvOut=csvR.readFirstln("Physics");
    file=csvR.readFile("Physics");
    HashMap<String, ArrayList<Integer>> CIHOut= new HashMap<>();
    CIHOut= CIH.commonHashMapCreator(csvOut);
    for(Map.Entry<String, ArrayList<Integer>> pair:CIHOut.entrySet()){
        System.out.println(pair.getValue());
    }
    ArrayList<Student> Students=new ArrayList<>();
    s.studentsForFile(CIHOut,file);
    }

}
