import java.time.DayOfWeek;
import java.time.LocalDate;

public class C2_1 {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.printf("%d %d\n",month,today);

        date = date.minusDays(today - 1); // set to start of month
        System.out.println(date);
        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println(weekday);
        int value = weekday.getValue(); // 1 = Monday, . . . , 7 = Sunday
        System.out.println(value);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 1; i < value+1; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
