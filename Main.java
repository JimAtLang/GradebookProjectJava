import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        new Main();
    }

    public Main(){
        Reader r = new Reader();
        ArrayList<String> headers = r.ReadFirstLine("data\\Physics");
        for (String header:headers){
            System.out.println(header);
        }
    }
}
