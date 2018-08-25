import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClassCalender {
    public static void main(String [] args){

        Date dt = new Date();
        System.out.println(dt);

        //GregorianCalendar  using for cut the time
        GregorianCalendar gc = new GregorianCalendar(2018, 7, 9);
        gc.add(GregorianCalendar.DATE,1);

        Date dt2 = gc.getTime();

        // DATE FORMAT
        DateFormat d1 = DateFormat.getDateInstance(DateFormat.FULL);
        String d2 = d1.format(dt2);
        System.out.println(d2);

    }
}
