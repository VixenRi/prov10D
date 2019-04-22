import java.util.Calendar;

public class Data {
    public static void main (String [] args){
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        a.set(2019,3,22);
        b.set(2019,6,01);
        long day1 = a.getTimeInMillis();
        long day2 = b.getTimeInMillis();
        day1+=1000*60*60;
        day2+=1000*60*60;
        a.setTimeInMillis(day1);
        b.setTimeInMillis(day2);
        long c = day2-day1;
        c=(c/24/1000/60/60)-26;
        System.out.println("До конца учебного года осталось "+c+" дней");
    }
}
