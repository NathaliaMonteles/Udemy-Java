package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the width of retangle: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Enter the height of retangle: ");
        rectangle.height = sc.nextDouble();
        
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());

        sc.close();
        
    }

}
