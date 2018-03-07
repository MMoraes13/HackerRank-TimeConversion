import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String[] sResult = s.split (":");
        Integer hour, minute, seconds;
        hour = Integer.parseInt (sResult[0]);
        if (sResult[2].charAt(2) == 'P') {
            if (hour < 12)
                hour += 12;  
        }  
        else {
            if (hour == 12)
                hour = 0;
            else hour = Integer.parseInt (sResult[0]);
        }
        if (hour < 12) return "0"+hour+":"+sResult[1]+":"+sResult[2].substring(0,2);
        return hour+":"+sResult[1]+":"+sResult[2].substring(0,2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
