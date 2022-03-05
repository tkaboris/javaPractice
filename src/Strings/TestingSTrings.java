package Strings;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestingSTrings {
    public static void main(String[] args) {
        String str = "MyJobs";
        System.out.println(str.substring(str.length()-3));

        // current date
        LocalDate now = LocalDate.now();

// format date to string
        String dateStr = now.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

// print date string
        System.out.println(dateStr);


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
