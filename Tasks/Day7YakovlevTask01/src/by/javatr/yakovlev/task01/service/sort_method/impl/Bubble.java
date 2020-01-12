package by.javatr.yakovlev.task01.service.sort_method.impl;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;

public class Bubble implements ISortMethod {

    @Override
    public void sort(Array array, boolean reverse) {
        if (array.isEmpty() || array.length == 1){
            return;
        }

        boolean flag;

        for (int i = array.length - 2; i >= 0 ; i--){
            flag = true;
            for (int j = 0; j <= i; j++){
                if (array.getArrayElement(j) < array.getArrayElement(j + 1)){
                    SortUtil.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }

        if (reverse){
            SortUtil.reverse(array);
        }
    }
}
