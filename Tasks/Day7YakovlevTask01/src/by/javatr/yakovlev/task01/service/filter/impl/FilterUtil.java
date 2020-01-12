package by.javatr.yakovlev.task01.service.filter.impl;

public class FilterUtil {

    static int numberOfDigits(int number) {

        int d = 1;

        while ((number = number / 10) != 0) {
            d++;
        }

        return d;
    }
}
