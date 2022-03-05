package Strings;

public class withoutEnd {
    public static void main(String[] args) {
        System.out.println(takeOutFirstAndLastChars("hello"));
    }

    public static String takeOutFirstAndLastChars(String str){
        String newString = str.substring(1, str.length()-1);
        return newString;
    }


}
