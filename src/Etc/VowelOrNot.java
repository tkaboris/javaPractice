package Etc;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any character");
        char c = scanner.next().charAt(0);

        // logic for vowel or not
        boolean isVowel = false;
        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel=true;
        }
        if(isVowel){
            System.out.println(c + " is vowel");
        } else{
            System.out.println(c + " is not vowel");
        }
    }
}
