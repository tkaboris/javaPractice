package Strings;

public class firstHalf {
    public static void main(String[] args) {
        System.out.println(cutInHalf("Testimony"));
    }

    public static String cutInHalf(String str){
        String newString = str.substring(0, str.length()/2);
                return newString;
    }
}
