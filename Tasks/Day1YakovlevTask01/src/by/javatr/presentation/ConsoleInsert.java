package by.javatr.presentation;

import java.util.Scanner;

public class ConsoleInsert {

    public int takeInt(){

        int res;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert integer number >");
        while (!scanner.hasNextInt()){

            System.out.print(scanner.nextLine() + " is not an integer number\n");
            System.out.print("Insert integer number >");
        }

        res = scanner.nextInt();
        scanner.close();
        return res;
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
