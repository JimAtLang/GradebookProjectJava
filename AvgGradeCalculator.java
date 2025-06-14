import java.util.ArrayList;
import java.util.HashMap;

class AvgGradeCalculator {
    //Need two parts in the function:
    //1. Grade-point convertor (for differently weighted assignments to gain a common denominator)
    //2. Grade Averager (which averages the grades)
    private final double HwWeight=1.0;
    private final double ProjectWeight=1.5;
    private final double QuizWeight=2.0;
    private final double TestWeight=2.5;
    private final double FinalWeight=3.0;

    public double GradePointConvertor(String assignmentType, int x){
        if (assignmentType == "HW"){
            return x*HwWeight;
        }
        else if (assignmentType == "Quiz"){
            return x*QuizWeight;
        }
        else if (assignmentType == "Test"){
            return x*TestWeight;
        }
        else if (assignmentType == "Final"){
            return x*FinalWeight;
        }
        else if (assignmentType == "Project"){
            return x*ProjectWeight;
        }
        System.out.println("Something is wrong");
        return 0;
    }

    public int GradeAverager(HashMap<String, ArrayList<Integer>> hm){
        int average = 0;
        int numerator = 0;
        double denominator = 0;
        for (String k:hm.keySet()){
            for(int i: hm.get(k)){
                numerator+=GradePointConvertor(k, i);
            }
        if (k=="HW") {
            denominator += hm.get(k).size()*HwWeight;
            }
         if (k=="Project") {
            denominator += hm.get(k).size()*ProjectWeight;
            }
         if (k=="Quiz") {
            denominator += hm.get(k).size()*QuizWeight;
            }
         if (k=="Test") {
            denominator += hm.get(k).size()*TestWeight;
            }
        if (k=="Final") {
            denominator += hm.get(k).size()*FinalWeight;
            }
    }
    average = (int)(numerator/denominator);
    return average;
}

}
