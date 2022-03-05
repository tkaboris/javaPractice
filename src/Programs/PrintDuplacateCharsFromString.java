package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// https://www.youtube.com/watch?v=JsOwYqW-2AE&list=PLsjUcU8CQXGGX_f8J-72CS8ikTjl-6qKJ&index=23
public class PrintDuplacateCharsFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any english text");
        String str = scanner.nextLine();

        // create char array and create hashmap and investigate each char in array
        // ca - character
        // m - hashmap
        // c character in iteration
        char[] ca = str.toCharArray();
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(Character c : ca){
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else {
                m.put(c,1);  // key, value
            }
        }
        for(Character c : m.keySet()){
            if(m.get(c)> 1){
                System.out.println("character  " +c+ " is repeated " + m.get(c)+ " times");
            }


        }


    }
}
