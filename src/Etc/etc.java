package Etc;

import java.util.Scanner;

public class etc {
    public static void main(String[] args) {
        // priority of operations
        System.out.println(9+6-3*4/2%5); //  * / % + -
        System.out.println(7+(3*5)*(4/2)+(5%3)-1); // (), *, /, %, +, -
        //-------------


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int firstnumber = scanner.nextInt();
        System.out.println("enter 2 number");
        int secondnumber = scanner.nextInt();

        System.out.println(firstnumber + secondnumber);
    }
}
