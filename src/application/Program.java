package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter the student name:");
        student.name = sc.nextLine();

        System.out.print("Enter the first trimester's grade: ");
        student.firstTrimester = sc.nextDouble();

        System.out.print("Enter the second trimester's grade: ");
        student.secondTrimester = sc.nextDouble();

        System.out.print("Enter the third trimester's grade: ");
        student.thirdTrimester = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if (student.finalGrade() >= 60.00)
            System.out.println("PASS");
        else{
                System.out.println("FAILED");
                double missingPoints = 60.00 - student.finalGrade();
                System.out.printf("MISSING %.2f POINTS%n", missingPoints);
        }
    }
}
