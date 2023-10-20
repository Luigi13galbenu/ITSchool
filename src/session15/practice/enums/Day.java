package session15.practice.enums;

import java.time.MonthDay;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true);

    private boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay(){
        return isWeekDay;
    }
}