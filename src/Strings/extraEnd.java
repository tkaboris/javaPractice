package Strings;

public class extraEnd {
    public static void main(String[] args) {
       String str = "Hello";
        System.out.println(addToEndOfWord("hello"));
    }
    //Given a string, return a new string made of 3 copies of the last 2 chars of the
    //original string. The string length will be at least 2.

    public static String addToEndOfWord(String str){
        String last = str.substring(str.length() -2);
        return last + last + last;
    }
}
