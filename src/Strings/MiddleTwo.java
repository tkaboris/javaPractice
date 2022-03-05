package Strings;
//Given a string of even length, return a string made of the middle two chars,
// so the string "string" yields "ri". The string length will be at least 2.
public class MiddleTwo {
    public static void main(String[] args) {
        System.out.println(middleTwo("Berrys"));
    }
    static String middleTwo(String str){
        int half = str.length() / 2;
        return str.substring(half-1, half+1);
    }
}
