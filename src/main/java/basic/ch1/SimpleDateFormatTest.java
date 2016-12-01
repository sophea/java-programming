package basic.ch1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws Exception {

        Date now = new Date();
        System.out.println("toString(): " + now);  // dow mon dd hh:mm:ss zzz yyyy
        
        // SimpleDateFormat can be used to control the date/time display format:
        //   E (day of week): 3E or fewer (in text xxx), >3E (in full text)
        //   M (month): M (in number), MM (in number with leading zero)
        //              3M: (in text xxx), >3M: (in full text full)
        //   h (hour): h, hh (with leading zero)
        //   H (hour) 24h
        //   m (minute)
        //   s (second)
        //   a (AM/PM)
        //   H (hour in 0 to 23)
        //   z (time zone)
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1:   " + dateFormatter.format(now));

        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2:   " + dateFormatter.format(now));
        
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3:   " + dateFormatter.format(now));
        
        
        
        dateFormatter = new SimpleDateFormat("yyyy-mm-dd'T'HH:mm:ssZ");
        System.out.println("Format 4:   " + dateFormatter.format(now));
        
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        System.out.println("Format 5:   " + dateFormatter.format(now));
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(new Date());
        System.out.println(date); //15/10/2013
        
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Format 6:   " + dateFormat.format(new Date())); //2013/10/15 16:16:39
        
        convertStringToDate();
    }
    
    
    public static void convertStringToDate() throws Exception {
        System.out.println("===============Convert String to Date.=========");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";
        Date date = sdf.parse(dateInString);
        System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
    }
}
