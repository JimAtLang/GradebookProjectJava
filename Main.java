    import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileReader;
    import java.io.IOException;

public class Main {
public static void main(String[] args){
    new Main();
}
String line= System.getProperty("line.separator");
String strArray[] = new String[5];



public String readFirsln(String filename) throws IOException{
                String content = null;
                File file = new File(filename); // For example, foo.txt
                FileReader reader = null;
                try {
                    String text = null;
                    BufferedReader brTest = new BufferedReader(new FileReader(file));
                    text = brTest .readLine();
            System.out.println("text = " + text );
             strArray= text.split(",");
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if(reader != null){
                        reader.close();
                    }
                }
                //System.out.println(content);
                return content;
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
    readFirstln("Music");
    }
}
