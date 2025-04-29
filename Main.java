    import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.ArrayList;

public class Main {
public static void main(String[] args){
    new Main();
}
String line= System.getProperty("line.separator");
ArrayList<String> assignments = new ArrayList<>();



public ArrayList<String> readFirstln(String filename){
                File file = new File(filename); // For example, foo.txt
                FileReader reader = null;
                try {
                    String text = null;
                    BufferedReader brTest = new BufferedReader(new FileReader(file));
                    text = brTest.readLine();
            System.out.println("text = " + text );
             String[] test=text.split(",");
             int i=1;
             for(String schoolWork: test){
                if(i>=test.length){
                    break;
                }
                assignments.add(test[i]);
                i+=1;
             }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                for(String a:assignments){
                    System.out.print(a);
                }
                return assignments;
                }
/*public String readFile(String filename) throws IOException{
    String content = null;
    File file = new File(filename); // For example, foo.txt
    FileReader reader = null;
    try {
        reader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        brTest.read(chars);
        content = new String(chars);
        brTest.close();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if(reader != null){
            reader.close();
        }
    }
    //System.out.println(content);
    return content;
    }*/
    public Main(){
        readFirstln("data\\Music");
    }
}
