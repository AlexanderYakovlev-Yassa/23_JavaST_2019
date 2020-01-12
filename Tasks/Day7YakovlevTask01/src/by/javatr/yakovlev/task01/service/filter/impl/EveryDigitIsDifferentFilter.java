package by.javatr.yakovlev.task01.service.filter.impl;

import by.javatr.yakovlev.task01.service.filter.IFilter;

public class EveryDigitIsDifferentFilter implements IFilter {

    @Override
    public boolean isFiltered(int element) {

        element = Math.abs(element);
        int[] digits = parseToDigits(element);
        int[] spectrum = new int[10];

        for (int i : digits) {
            spectrum[i]++;
        }

        for (int i : spectrum){
            if (i > 1){
                return false;
            }
        }

        return true;
    }

    private static int[] parseToDigits(int number) {

        int[] digits = new int[FilterUtil.numberOfDigits(number)];
        int temp;

        for (int i = 0; i < digits.length; i++) {
            temp = number % 10;
            digits[digits.length - i - 1] = temp;
            number /= 10;
        }

        return digits;
    }
}
