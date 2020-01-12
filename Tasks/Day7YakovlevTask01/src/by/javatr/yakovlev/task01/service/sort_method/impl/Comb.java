package by.javatr.yakovlev.task01.service.sort_method.impl;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;

public class Comb implements ISortMethod {

    @Override
    public void sort(Array array, boolean reverse) {
        if (array.isEmpty() || array.length == 1){
            return;
        }

        final double FACTOR = 1.247;
        int clearance = array.length;

        do {
            clearance = (int)(clearance/FACTOR);
            for (int i = clearance; i < array.length; i++) {
                if (array.getArrayElement(i - clearance) < array.getArrayElement(i)) {
                    SortUtil.swap(array, i - clearance, i);
                }
            }
        } while (clearance > 1);

        if (reverse){
            SortUtil.reverse(array);
        }
    }
}
