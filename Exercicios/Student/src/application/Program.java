import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter the student's name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the grades of the student:");

        System.out.print("First grade: ");
        student.firstGrade = sc.nextDouble();

        System.out.print("Second grade: ");
        student.secondGrade = sc.nextDouble();

        System.out.print("Third grade: ");
        student.thirdGrade = sc.nextDouble();

        sc.close();

        System.out.println("Student: " + student);

        if (student.average() >= 60.0) {
            System.out.println("PASSED");
        } else {
            double missingPoints = student.missing();
            System.out.println("FAILED, MISSING " + String.format("%.2f", missingPoints) + " points");
        }   
    }
}


