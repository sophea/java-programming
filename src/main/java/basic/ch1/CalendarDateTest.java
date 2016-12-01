package basic.ch1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDateTest {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2009-12-31");
        Date date2 = sdf.parse("2010-01-31");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);

        if (cal1.after(cal2)) {
            System.out.println("Date1 is after Date2");
        }

        if (cal1.before(cal2)) {
            System.out.println("Date1 is before Date2");
        }

        if (cal1.equals(cal2)) {
            System.out.println("Date1 is equal Date2");
        }

        testCalendar();
    }
    
    public static void testCalendar() throws Exception {
        Calendar cal = Calendar.getInstance();   // GregorianCalendar
        System.out.println("Calendar's toString() is : " + cal + "\n");
        System.out.println("Time zone is: " + cal.getTimeZone() + "\n");
    
        // An Easier way to print the timestamp by getting a Date instance
        Date date = cal.getTime();
        System.out.println("Current date and time in Date's toString() is : " + date + "\n");
    
        // Print Calendar's field
        System.out.println("Year  : " + cal.get(Calendar.YEAR));
        System.out.println("Month : " + cal.get(Calendar.MONTH));
        System.out.println("Day of Month : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week  : " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of Year  : " + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week of Year : " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of Month : " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Day of the Week in Month : " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hour  : " + cal.get(Calendar.HOUR));
        System.out.println("AM PM : " + cal.get(Calendar.AM_PM));
        System.out.println("Hour of the Day : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute : " + cal.get(Calendar.MINUTE));
        System.out.println("Second : " + cal.get(Calendar.SECOND));
        System.out.println();
    
        // Manipulating Dates
        Calendar calTemp;
        calTemp = (Calendar) cal.clone();
        calTemp.add(Calendar.DAY_OF_YEAR, -365);
        System.out.println("365 days ago, it was: " + calTemp.getTime());

        calTemp = (Calendar) cal.clone();
        calTemp.add(Calendar.HOUR_OF_DAY, 11);
        System.out.println("After 11 hours, it will be: " + calTemp.getTime());

        // Roll
        calTemp = (Calendar) cal.clone();
        calTemp.roll(Calendar.HOUR_OF_DAY, 11);
        System.out.println("Roll 11 hours, it will be: " + calTemp.getTime());
        System.out.println();
    }

}
