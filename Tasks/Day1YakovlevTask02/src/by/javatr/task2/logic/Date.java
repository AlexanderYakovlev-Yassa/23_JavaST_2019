package by.javatr.task2.logic;

import java.util.Objects;

public class Date {

    private int year;
    private Month month;

    protected Date(){
        this.year = 1;
        this.month = Month.JANUARY;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return getYear() == date.getYear() &&
                getMonth() == date.getMonth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth());
    }
}
