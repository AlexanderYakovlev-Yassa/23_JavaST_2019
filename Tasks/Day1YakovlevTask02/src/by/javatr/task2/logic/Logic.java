package by.javatr.task2.logic;

public class Logic implements DateLogic {

    @Override
    public int monthDayCount(Date date) {

        Month month = date.getMonth();
        int res = 0;

        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DESEMBER: {
                res = 31;
            }
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER: {
                res = 30;
            }
            case FEBRUARY: {
                if (isLeapYear(date)) {
                    res = 29;
                } else {
                    res = 28;
                }
            }
        }
        return res;
    }

    @Override
    public boolean isLeapYear(Date date) {

        boolean res = false;
        int year = date.getYear();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                res = true;
            } else if (year % 400 == 0) {
                res = true;
            }
        }

        return res;
    }

    @Override
    public Date createDate(int year, int month) {                           //needs throw InvalidDate

        Date date = null;

        if (isYearCorrect(year) && isMonthCorrect(month)) {

            date = new Date();
            date.setYear(year);
            date.setMonth(monthByNumber(month));
        } else {
            //throw InvalidDate
        }

        return date;
    }

    @Override
    public Date createDate() {

        Date date =  new Date();
        date.setYear(1);
        date.setMonth(monthByNumber(1));

        return date;
    }

    private boolean isYearCorrect(int year) {

        return year > 0 && year <= 9999;
    }

    private boolean isMonthCorrect(int month) {

        return month > 0 && month <= 12;
    }

    private Month monthByNumber(int number) {

        Month month = null;

        for (Month m : Month.values()) {
            if (m.ordinal() == number) {
                month = m;
                break;
            }
        }

        return month;
    }
}
