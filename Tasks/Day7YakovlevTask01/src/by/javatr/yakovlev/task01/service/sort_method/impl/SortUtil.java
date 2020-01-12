package by.javatr.yakovlev.task01.service.sort_method.impl;

import by.javatr.yakovlev.task01.array.Array;

public class SortUtil {

    static void swap(Array array, int firstIndex, int secondIndex){

        if (array.length <= firstIndex || array.length <= secondIndex || firstIndex == secondIndex){
            return;
        }

        int bubble = array.getArrayElement(firstIndex);
        array.setArrayElement(firstIndex, array.getArrayElement(secondIndex));
        array.setArrayElement(secondIndex, bubble);
    }

    static void reverse(Array array){
        for (int i = 0; i < array.length/2; i++){
            swap(array, i, array.length-1-i);
        }
    }
}
