package Strings;

public class ReverseDigits {
    public static void main(String[] args) {
       int x = 353456;
        System.out.println("reversed number is " + reverse(x));

    }
    static int reverse(int x){
    int reversed = 0;
    int pop;
    while (x !=0){
        pop = x % 10; // last digit 3
        x = x/10; // x now 35 divides by 10 ->3
        reversed = (reversed * 10) + pop;
    }
    return reversed;
    }
}
