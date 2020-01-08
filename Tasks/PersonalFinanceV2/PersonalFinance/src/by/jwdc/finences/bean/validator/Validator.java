package by.jwdc.finences.bean.validator;

public class Validator {

    private static final Validator instance = new Validator();

    private Validator(){}

    public static Validator getInstance() {
        return instance;
    }

    public boolean isDateCorrect(int year, int month, int day, int hour, int minute){

        boolean res = true;

        if (month < 1 || month > 12){
            return false;
        }
        System.out.println(maxDayOfMonth(year, month));
        if (day < 1 || day > maxDayOfMonth(year, month)){
            return false;
        }

        if (hour < 0 || hour > 24){
            return false;
        }

        if (minute < 0 || minute > 59){
            return false;
        }

        return res;
    }

    private int maxDayOfMonth(int year, int month){
        final int[] max = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        month--;

        return  (month == 1 && isLeapYear(year)) ? max[month] + 1 : max[month];
    }

    private boolean isLeapYear(int year){

        if (!(year % 4 == 0)){
            return false;
        }
        if (!(year % 100 == 0)){
            return true;
        }
        if (!(year % 400 == 0)){
            return false;
        }

        return true;
    }

    //******************************************************************* TEST *****************************************
    public static void main(String[] args) {

        Validator validator = Validator.getInstance();

        System.out.println(validator.isDateCorrect(2020, 2, 30, 14, 45));
        System.out.println("leap year " + validator.isLeapYear(2020));
    }
}
