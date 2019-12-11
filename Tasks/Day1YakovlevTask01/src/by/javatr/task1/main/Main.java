package by.javatr.task1.main;

import by.javatr.task1.logic.Logic;
import by.javatr.presentation.ConsoleInsert;

public class Main {

    public static void main(String[] args) {

        Logic squareLastDigit = new Logic();

        ConsoleInsert consoleInsert = new ConsoleInsert();

        int number = consoleInsert.takeInt();

        System.out.print("The last digit of square of " + number + " is ");
        System.out.println(squareLastDigit.defineSquareLastDigit(number) + ".");
    }
}
