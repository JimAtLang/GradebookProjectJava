import java.util.ArrayList;
import java.util.HashMap;
ArrayList<Integer> gradeIndex= new ArrayList();
class CommonIndexHash{
    public HashMap<String,ArrayList<Integer>> commonHashMapCreator(ArrayList<String> grades){
        HashMap<String,ArrayList<Integer>> Hashmap = new HashMap<>();
        Hashmap.put("HW", gradeIndex);
        Hashmap.put("Project", gradeIndex);
        Hashmap.put("Quiz", gradeIndex);
        Hashmap.put("Test", gradeIndex);
        Hashmap.put("Final", gradeIndex);
        for (String t:grades){
            if(t.contains("HW")){
                
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
