import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {
    public ArrayList<String> ReadFirstLine(String fileName){
        ArrayList<String> headers = new ArrayList<>();
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String firstLine = br.readLine();
            headers.addAll(Arrays.asList(firstLine.split(",")));
        } catch(IOException e){
            System.out.println("IOException" + e.getMessage());
        }
        return headers;
    }

    public ArrayList<ArrayList<String>> readLines(String filename){
        ArrayList<ArrayList<String>> grades = new ArrayList<>();
        try{
            FileReader fr = new FileReader("data\\" + filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                grades.add((ArrayList<String>)Arrays.asList(line.split(",")));
            }
        } catch (IOException e){
            System.out.println("IOException:" + e.getMessage());
        }
        return grades;
    }
}
