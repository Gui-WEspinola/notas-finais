package entities;

public class Student {
    public String name;
    public double firstTrimester;
    public double secondTrimester;
    public double thirdTrimester;

    public double finalGrade(){
        double finalGrade = firstTrimester + secondTrimester + thirdTrimester;
        return finalGrade;
    }

}
