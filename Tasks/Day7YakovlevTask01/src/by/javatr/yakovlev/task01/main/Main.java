package by.javatr.yakovlev.task01.main;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;
import by.javatr.yakovlev.task01.service.ServiceFactory;

public class Main {

    public static void main(String[] args) {

        ServiceFactory factory = ServiceFactory.getInstance();
        ISortMethod bubble = factory.getBubbleSortMethod();

        Array arr = new Array(new int[]{1, 15, 3, 4, 5});
        System.out.println(arr.toString());
        arr.sort(bubble, false);
        System.out.println(arr.toString());

        int[] nullArr = null;
        Array nullArray = new Array(nullArr);
    }
}
