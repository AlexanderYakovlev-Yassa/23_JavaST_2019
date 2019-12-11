package by.javatr.task2.main;

import by.javatr.task2.logic.Logic;
import by.javatr.task2.logic.Date;
import by.javatr.task2.presentation.Presentation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Logic logic = new Logic();

		int year;
		int month;
		Date date = null;

		date = Presentation.takeDate();


		System.out.println("\nThere are " + logic.monthDayCount(date) + " days in " +
				date.getMonth() + "th month of 2000");

	}
}
