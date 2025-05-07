import java.util.ArrayList;
import java.util.HashMap;
public ArrayList<Integer> HWgradeIndex=new ArrayList();
public ArrayList<Integer> ProjectgradeIndex=new ArrayList();
public ArrayList<Integer> QuizgradeIndex=new ArrayList();
public ArrayList<Integer> TestgradeIndex=new ArrayList();
public ArrayList<Integer>FinalgradeIndex=new ArrayList();
class CommonIndexHash{
    public HashMap<String,ArrayList<Integer>> commonHashMapCreator(ArrayList<String> grades){
        int count = 0;
        HashMap<String,ArrayList<Integer>> Hashmap = new HashMap<>();
        Hashmap.put("HW", HWgradeIndex);
        Hashmap.put("Project", ProjectgradeIndex);
        Hashmap.put("Quiz", QuizgradeIndex);
        Hashmap.put("Test", TestgradeIndex);
        Hashmap.put("Final", FinalgradeIndex);
        for (String t:grades){
            if(t.contains("HW")){
                count += 1;
            }
        }
        return Hashmap;
    }










    //private String dropNumbers(String s){
        //for (char c:s.toCharArray()){
            //if ((c=='0')||(c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9')){
                //s.r(c)
            //}
            //return s
        //}
    //}
}
