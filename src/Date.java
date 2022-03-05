import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date = new java.util.Date();
        System.out.println(dateFormat.format(date));

    }
}
//https://www.tutorialspoint.com/how-to-retrieve-date-from-a-table-in-jdbc