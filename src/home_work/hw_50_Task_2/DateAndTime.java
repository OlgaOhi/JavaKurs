package home_work.hw_50_Task_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        int currentYear = today.getYear();
        Month currentMonth = today.getMonth();
        int currentDay = today.getDayOfMonth();
        System.out.println("Current year: " + currentYear + ", month: " + currentMonth + ", day: " + currentDay);

        LocalDate myBirthday = LocalDate.of(1981, Month.JUNE, 18);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String formattedDate = myBirthday.format(formatter);
        System.out.println("My Birthday: " + formattedDate);

        LocalDate date1 = LocalDate.of(2025, Month.APRIL, 27);
        LocalDate date2 = LocalDate.of(2025, Month.AUGUST, 6);
        if (date1.isEqual(date2)) {
            System.out.println(date1 + " and " + date2 + " - these dates are equal");
        } else  {
            System.out.println(date1 + " and " + date2 + " - these dates are not equal");
        }

        LocalTime nowTime =LocalTime.now();
        System.out.println("Current time: " + nowTime);

        LocalTime timePlus3Hours = nowTime.plusHours(3);
        System.out.println("Current time +3 hours: " + timePlus3Hours);

        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Date in 1 week: " + nextWeek);

        LocalDate oneYearAgo = today.minusYears(1);
        System.out.println("Date one year ago: " + oneYearAgo);

        LocalDate oneYearLater = today.plusYears(1);
        System.out.println("Date one year later: " + oneYearLater);

        LocalDate today1 = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Today: " + today1);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Tomorrow: " + tomorrow);
        if (yesterday.isBefore(today)) {
            System.out.println("Yesterday until today");
        } else {
            System.out.println("Yesterday after today");
        }
        if (tomorrow.isAfter(today)) {
            System.out.println("Tomorrow after today");
        } else {
            System.out.println("Tomorrow until today");

        }

    }
}
