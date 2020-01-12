package by.javatr.yakovlev.task01.service.filter.impl;

import by.javatr.yakovlev.task01.service.filter.IFilter;

public class FibonacciFilter implements IFilter {

    @Override
    public boolean isFiltered(int element) {
        if (element < 0) {
            return false;
        }

        if (element == 0) {
            return true;
        }

        int i = 0;
        int fibonacci = 1;
        int temp = 0;
        while (fibonacci < element) {
            temp = fibonacci;
            fibonacci += i;
            i = temp;
        }

        if (fibonacci == element) {
            return true;
        }

        return false;
    }
}
