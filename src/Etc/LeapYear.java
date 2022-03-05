package Etc;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

// Leap Year is an year having 366 days, while the normal year has 365 days.
// If the year is evenly divisible by 4 and not divisible by 100, then it is a Leap year.
// If the year is evenly divisible by both 4 and 100,
//then we need to check if it is evenly divisible by 400, to confirm it as Leap year.
//Leap year = year / 4 == 0 , Year / 100 !=0
// regular year = year / 4 == 0 , Year / 100 ==0 , Year / 400 ==0
// https://www.youtube.com/watch?v=kgkyRs1VgKk&list=PLsjUcU8CQXGGX_f8J-72CS8ikTjl-6qKJ&index=7

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any year");
        int year = scanner.nextInt();

        // logic for any year is leap year or not
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        }else {
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.println("given year " + year + " is a leap year");
        } else {
            System.out.println("given year " + year + " is not aleap year");
        }
    }
}
