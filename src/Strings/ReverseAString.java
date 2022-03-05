package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "geeks";
        String newStr="";
        char ch;

        System.out.println("Original word is " + str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            newStr = ch+newStr; // adds each character in front of the string
        }
        System.out.println("reversed word is : " + newStr);

        // other way with array https://www.youtube.com/watch?v=Zk2giJu0MMY&list=PLsjUcU8CQXGGX_f8J-72CS8ikTjl-6qKJ&index=26
         String s = "Alexander";
         char[] ca = s.toCharArray();
         int size = ca.length;
         String reversedString = "";
         for(int i = size-1; i>=0; i--){
             reversedString = reversedString + ca[i];
         }
        System.out.println(reversedString);




    }
}
