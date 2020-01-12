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

    @Override
    public int binarySearch(Array array, int element) {

        if (array == null || array.isEmpty()){
            return -1;
        }
        if (array.length == 1){
            return 0;
        }

        ServiceFactory factory = ServiceFactory.getInstance();
        ISortMethod sortMethod = factory.getCombSortMethod();

        array.sort(sortMethod, true);

        int pos;
        if (array.getArrayElement(0) == element) {
            pos = 0;
        } else if (array.getArrayElement(array.length - 1) == element) {
            pos = array.length - 1;
        } else {
            pos = binarySearch(array, element, 0, array.length - 1);
        }

        return pos;
    }

    public int binarySearch(Array array, int element, int left, int right) {

        int pos;
        int center = left + (right - left) / 2;

        if (array.getArrayElement(center) == element) {
            pos = center;
        } else if (right - left == 1) {
            pos = -1;
        } else if (array.getArrayElement(center) < element) {
            pos = binarySearch(array, element, center, right);
        } else {
            pos = binarySearch(array, element, left, center);
        }

        return pos;
    }
}
