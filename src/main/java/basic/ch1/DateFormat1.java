package basic.ch1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat1 {

    public static void main(String[] args) throws Exception {
        
        
    }
    
    public static void convertStringToDate() throws Exception {
        System.out.println("===============Convert String to Date.=========");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";
        Date date = sdf.parse(dateInString);
        System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
    }
}
