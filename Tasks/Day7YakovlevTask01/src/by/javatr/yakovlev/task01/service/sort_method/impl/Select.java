package by.javatr.yakovlev.task01.service.sort_method.impl;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;

public class Select implements ISortMethod {

    @Override
    public void sort(Array array, boolean reverse) {
        if (array.isEmpty() || array.length == 1){
            return;
        }

        for (int i = 0; i < array.length-1; i++){

            int fromIndex = i + 1;
            int toIndex = array.length - 1;

            Array tempSubArray = array.subArray(fromIndex, toIndex);

            int maxElementIndex = tempSubArray.getMaxElementIndex() + fromIndex;

            SortUtil.swap(array, i, maxElementIndex);
        }

        if (reverse){
            SortUtil.reverse(array);
        }
    }
}
