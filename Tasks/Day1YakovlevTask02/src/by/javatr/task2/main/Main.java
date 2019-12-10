package by.javatr.task2.main;

import by.javatr.task2.logic.DateLogic;
import by.javatr.task2.logic.Logic;
import by.javatr.task2.logic.Date;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DateLogic logic = new Logic();

		int year;
		int month;
		Date date = null;

		while (date == null){

			year = takeInt("Insert year");
			month = takeInt("Insert month");

			date = logic.createDate(year, month);
		}

		System.out.println("/nThere are " + logic.monthDayCount(date) + " days in " +
				date.getMonth().name().toLowerCase() + " of 2000");

	}

	public static int takeInt(String invitation){

		int res;

		Scanner scanner = new Scanner(System.in);
		System.out.print(invitation + " >");
		while (!scanner.hasNextInt()){

			System.out.print(scanner.nextLine() + " is not an integer number\n");
			System.out.print("Insert integer number >");
		}

		res = scanner.nextInt();
		//scanner.close();
		return res;
	}

}
