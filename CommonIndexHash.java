import java.util.ArrayList;
import java.util.HashMap;
class CommonIndexHash{
    public ArrayList<Integer> HWgradeIndex=new ArrayList<Integer>();
    public ArrayList<Integer> ProjectgradeIndex=new ArrayList<Integer>();
    public ArrayList<Integer> QuizgradeIndex=new ArrayList<Integer>();
    public ArrayList<Integer> TestgradeIndex=new ArrayList<Integer>();
    public ArrayList<Integer> FinalgradeIndex=new ArrayList<Integer>();
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
                Hashmap.get("HW").add(count);
            }
            else if(t.contains("Project")){
                Hashmap.get("Project").add(count);
            }
            else if(t.contains("Quiz")){
                Hashmap.get("Quiz").add(count);
            }
            else if(t.contains("Test")){
                Hashmap.get("Test").add(count);
            }
            else if(t.contains("Final")){
                Hashmap.get("Final").add(count);
            }
            count ++;
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
