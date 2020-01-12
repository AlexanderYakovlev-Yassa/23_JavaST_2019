package by.javatr.yakovlev.task01.service.filter.impl;

import by.javatr.yakovlev.task01.service.filter.IFilter;

public class PrimeNumberFilter implements IFilter {

    @Override
    public boolean isFiltered(int element) {
        if (element < 2) {
            return false;
        }

        boolean flag = true;

        for (int i = 2; i < element; i++) {
            if ((element % i) == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
