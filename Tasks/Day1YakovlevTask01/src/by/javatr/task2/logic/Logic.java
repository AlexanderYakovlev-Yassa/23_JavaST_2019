package by.javatr.task2.logic;

import by.javatr.task2.logic.validation.DateValidation;

public class Logic {

    public int monthDayCount(Date date) {



        int month = date.getMonth();
        int res = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                res = 31;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                res = 30;
            }
            case 2: {
                if (isLeapYear(date)) {
                    res = 29;
                } else {
                    res = 28;
                }
            }
        }
        return res;
    }

    private boolean isLeapYear(Date date) {

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

    public static Date createDate(int year, int month) {                           //needs throw InvalidDate

        Date date = null;

        if (DateValidation.isYearCorrect(year) && DateValidation.isMonthCorrect(month)) {

            date = new Date();
            date.setYear(year);
            date.setMonth(month);
        } else {
            //throw InvalidDate
        }

        return date;
    }

    public static Date createDate() {

        Date date =  new Date();

        return date;
    }
}
