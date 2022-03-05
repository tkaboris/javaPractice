package Etc;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter eny number");
        int num = scanner.nextInt();

        // multiplication table of the given input number
        for (int i = 0; i <=10; i++) {
            System.out.println(num + "x" + i + "=" + (num*i));
        }
    }
}
