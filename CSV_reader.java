import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSV_reader {
    ArrayList<ArrayList<String>> lines= new ArrayList<>();
    ArrayList<String> assignments = new ArrayList<>();


public ArrayList<String> readFirstln(String filename){
    File file = new File("data\\"+filename); // For example, foo.tx
    try {
    BufferedReader brTest = new BufferedReader(new FileReader(file));
    String[] text=brTest.readLine().split(",");
    int i=0;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return assignments;
}

//Reads file from 2nd line down
public ArrayList<ArrayList<String>> readFile(String filename){
    File file = new File("data\\"+filename);
    try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        while(br.readLine()!=null){
        ArrayList<String> studentArray= new ArrayList<>();
        String[] text=br.readLine().split(",");
        int i=0;     
        for(String word: text){
            studentArray.add(text[i]);
            i+=1;
        }
        lines.add(studentArray);
    }
    lines.remove(0);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return lines;
    }
}
