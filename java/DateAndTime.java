import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/challenges/java-date-and-time

public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar rightnow = Calendar.getInstance();
        // remember month starts from 0 in java.Calendar... that's the format they set as
        rightnow.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));         
        System.out.println(rightnow.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase());
    }
}
