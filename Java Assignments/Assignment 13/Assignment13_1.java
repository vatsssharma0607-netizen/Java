import java.time.*;
import java.time.format.DateTimeFormatter;
public class Assignment13_1 
{
    public static void main(String[] args) 
    {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);

        System.out.println("After 10 days: " + today.plusDays(10));
        System.out.println("After 2 months: " + today.plusMonths(2));
        System.out.println("After 1 year: " + today.plusYears(1));
        System.out.println("Before 15 days: " + today.minusDays(15));
        System.out.println("Day of the week: " + today.getDayOfWeek());
        System.out.println("Day of the year: " + today.getDayOfYear());
        System.out.println("Is Leap Year? " + today.isLeapYear());

        LocalDate examDate = LocalDate.of(2026, 12, 20);
        if(today.isBefore(examDate))
        {
            System.out.println("Exam Date: " + examDate);
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Date: " + dateTime.format(formatter));
        LocalDate parsedDateTime = LocalDate.parse("2026-06-15");
        System.out.println("Parsed Date: " + parsedDateTime);
    }
}