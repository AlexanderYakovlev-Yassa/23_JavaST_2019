package by.javatr.yakovlev.task01.service.impl;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.ILogic;
import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;
import by.javatr.yakovlev.task01.service.ServiceFactory;
import by.javatr.yakovlev.task01.service.filter.IFilter;

public class Logic implements ILogic {

    @Override
    public Array createArray() {
        return null;
    }

    @Override
    public Array filteredArray(Array array, IFilter filter) {

        int[] temporaryArray = new int[array.length];
        int i = 0;

        for (int number : array.toIntArray()) {

            if (filter.isFiltered(number)) {
                temporaryArray[i] = number;
                i++;
            }
        }

        int[] normalisedArray = new int[i];

        for (int j = 0; j < i; j++) {
            normalisedArray[j] = temporaryArray[j];
        }
        Array newArray = new Array(normalisedArray);

        return newArray;
    }
}
