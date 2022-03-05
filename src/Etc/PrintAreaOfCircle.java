package Etc;

import java.util.Scanner;

public class PrintAreaOfCircle {
    public static void main(String[] args) {

//We have to input the radius to the Program.
//- Radius is the center of the circle to the border of the circle.
// Area of the circle is Pi * radius * radius.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radios of the circle");
        double radius = scanner.nextDouble();

        System.out.println("area of circle with given radius" + radius + " is "+ (Math.PI * radius * radius));

    }
}
