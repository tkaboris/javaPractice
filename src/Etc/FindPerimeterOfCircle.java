package Etc;

import java.util.Scanner;

public class FindPerimeterOfCircle {
    public static void main(String[] args) {
        // 2* PI* radius

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius");
        double radius = scanner.nextDouble();

        System.out.println((2*radius*Math.PI));
    }
}
