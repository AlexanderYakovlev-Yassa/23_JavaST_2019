package by.javatr.task2.logic.validation;

import by.javatr.task2.logic.Date;

public class DateValidation {

    /*public static boolean isDateCorrect(Date date){

        if (date == null){
            return false;
        }

        if (!isYearCorrect(date.getYear()) || !isMonthCorrect(date.getMonth())){
            return false;
        }

        return true;
    }
*/
    public static boolean isYearCorrect(int year) {

        return year > 0 && year <= 9999;
    }

    public static boolean isMonthCorrect(int month) {

        return month > 0 && month <= 12;
    }

}
