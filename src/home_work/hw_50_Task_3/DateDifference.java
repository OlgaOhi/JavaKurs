package home_work.hw_50_Task_3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class DateDifference {

    public static long calculateDays(List<LocalDate> dates) {
        if (dates.isEmpty()) {
            return 0;
        }
        LocalDate earliestDate = dates.get(0);
        LocalDate latestDate = dates.get(0);

        for (LocalDate date : dates) {
            if (date.isBefore(earliestDate)) {
                earliestDate = date;
            }
            if (date.isAfter(latestDate)) {
                latestDate = date;
            }
        }
        return ChronoUnit.DAYS.between(earliestDate, latestDate);
    }
}
