package Strings;

public class endsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("jobly"));
//Given a string, return true if it ends in "ly".
    }
    public static boolean endsLy(String str){
        if (str.length() >=2){
            if (str.substring(str.length() - 2).equals("ly")){ // returns last 2 characters
                return true;
            }
        }
        return false;
    }
}
