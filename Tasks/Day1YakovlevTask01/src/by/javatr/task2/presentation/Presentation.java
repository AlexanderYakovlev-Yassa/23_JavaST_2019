package by.javatr.task2.presentation;

import by.javatr.task2.logic.Date;
import by.javatr.presentation.ConsoleInsert;
import by.javatr.task2.logic.Logic;

public class Presentation {

    public static Date takeDate(){

        Date date = null;

        int year;
        int month;

        while (date == null){

            year = ConsoleInsert.takeInt("Insert year");
            month = ConsoleInsert.takeInt("Insert month");

            date = Logic.createDate(year, month);

            if (date == null){
                System.out.println("Date is incorrect, try insert date again");
            }
        }

        return date;
    }
}
