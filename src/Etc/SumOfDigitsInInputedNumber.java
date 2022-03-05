package Etc;

import java.util.Scanner;

public class SumOfDigitsInInputedNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any digit number");
        int number = scanner.nextInt();
        scanner.close();

        //Logic

        int sum =0;
        while(number!=0){
            int reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        System.out.println("sum of all digits is: " + sum);

    }
}
