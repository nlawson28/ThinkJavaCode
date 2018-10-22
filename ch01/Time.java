/**
 * Created by Nate on 10/22/2018.
 */
/**
 * Created by Nate on 10/22/2018.
 */
public class Time {

    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        int total;
        int secondTotal;

        hour = 15;
        minute = 52;
        second = 30;
        total = (second + (minute * 60) + (hour * 3600));

        hour = 16;
        minute = 9;
        second = 45;
        secondTotal = (hour * 60 * 60 + minute + second);

        System.out.print("Number of seconds since midnight: ");
        System.out.println(total);
        System.out.print("Number of seconds since midnight: ");
        System.out.println(secondTotal);
        System.out.print("Percent of the day that has passed: ");
        System.out.println(total * 100 / 86400);
        System.out.print("Time elapsed since starting program: ");
        System.out.print(secondTotal - total);
        System.out.println(" seconds");
    }
}
