package Etc;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // quotient is how many times you can divide the number 6/2 = 3 q is 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int firstnumber = scanner.nextInt();
        System.out.println("enter second number");
        int secondnumber = scanner.nextInt();

        System.out.println("quotient is: " + (firstnumber/secondnumber));
        System.out.println("remainder is: " + (firstnumber%secondnumber));
    }
}
