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
        System.out.println("Something is wrong");
        return 0;
    }

}
