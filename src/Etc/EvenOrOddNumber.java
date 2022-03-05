package Etc;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");

        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
}
