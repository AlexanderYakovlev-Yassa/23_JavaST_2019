package by.javatr.yakovlev.task01.service.create.impl;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.create.ICreateMethod;

import java.util.Random;

public class CreateRandom implements ICreateMethod {

    @Override
    public Array createArray() {

        final int MAX_LENGTH = 500000;

        Random random = new Random();

        int length = Math.abs(random.nextInt(MAX_LENGTH));

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt();
        }

        Array array = new Array(arr);

        return array;
    }

    public static void main(String[] args) {
        CreateRandom c = new CreateRandom();
        Array array = c.createArray();
        System.out.println(array);
    }
}
