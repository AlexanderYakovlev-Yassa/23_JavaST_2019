package by.javatr.yakovlev.task01.service.filter.impl;

import by.javatr.yakovlev.task01.service.filter.IFilter;

public class TriDigitFilter implements IFilter {

    @Override
    public boolean isFiltered(int element) {

            return FilterUtil.numberOfDigits(element) == 3;
    }
}
