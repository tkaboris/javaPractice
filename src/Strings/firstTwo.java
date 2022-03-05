package Strings;

public class firstTwo {
    public static void main(String[] args) {
        System.out.println(firstThree("hello"));
    }
    // given a string, return a sting made of its first three chars
    public static String firstThree(String str){
        String nstring = str.substring(0,3);
                return nstring;
    }
}
