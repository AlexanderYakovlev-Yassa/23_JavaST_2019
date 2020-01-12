package by.javatr.yakovlev.task01.service;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.filter.IFilter;
import org.junit.Assert;
import org.junit.Test;

public class LogicTest {

    @Test
    public void filteredArrayTest() {

        ServiceFactory factory = ServiceFactory.getInstance();
        ILogic logic = factory.getLogic();
        IFilter primeNumberFilter = factory.getPrimeNumberFilter();
        IFilter fibonacciFilter = factory.getFibonacciFilter();
        IFilter everyDigitIsDifferentFilter = factory.getEveryDigitIsDifferentFilter();
        IFilter triDigitFilter = factory.getTriDigitFilter();

        /*List of first prime numbers
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
        103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199*/

        Array arr = new Array(new int[]{2, 31, -4, 5, 25, 69, -78, 0, 125, -187, 32, 14, 2, 588});
        Array arrPrime = new Array(new int[]{2, 31, 5, 2});

        int[] expected = new int[]{2, 31, 5, 2};
        int[] actual = logic.filteredArray(arr, primeNumberFilter).toIntArray();

        System.out.println(arr.toString());
        System.out.println(logic.filteredArray(arr, primeNumberFilter).toString());

        Assert.assertArrayEquals(expected, actual);

        /*List of the beginning of the Fibonacci sequence
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711
        */

        expected = new int[]{2, 5, 0, 2};
        actual = logic.filteredArray(arr, fibonacciFilter).toIntArray();

        Assert.assertArrayEquals(expected, actual);

        expected = new int[]{125, -187, 588};
        actual = logic.filteredArray(arr, triDigitFilter).toIntArray();
        printArray(actual);

        Assert.assertArrayEquals(expected, actual);

        expected = new int[]{125, -187};
        actual = logic.filteredArray(logic.filteredArray(arr, triDigitFilter), everyDigitIsDifferentFilter).toIntArray();
        printArray(actual);

        Assert.assertArrayEquals(expected, actual);

        arr = new Array(new int[]{2, 31, -4, 5, 25, 69, -78, 0, 12, -18, 32, 14, 2, 88});
        expected = new int[0];
        actual = logic.filteredArray(arr, triDigitFilter).toIntArray();

        Assert.assertArrayEquals(expected, actual);
    }



    @Test
    public void binarySearchTest() {

        ServiceFactory factory = ServiceFactory.getInstance();
        ILogic logic = factory.getLogic();


        Array arr = new Array(new int[]{2, 31, -4, 5, 25, 69, -78, 0, 12, -18, 32, 14, 2, 88});

        //sorted array
        //-78 -18 -4 0 2 2 5 12 14 25 31 32 69 88
        // 0   1   2 3 4 5 6 7  8  9  10 11 12 13

        int element = 0;
        int expected = 3;
        int actual = logic.binarySearch(arr, element);

        Assert.assertEquals(expected, actual);

        element = -78;
        expected = 0;
        actual = logic.binarySearch(arr, element);

        Assert.assertEquals(expected, actual);

        element = 88;
        expected = 13;
        actual = logic.binarySearch(arr, element);

        Assert.assertEquals(expected, actual);

        element = 55;
        expected = -1;
        actual = logic.binarySearch(arr, element);

        Assert.assertEquals(expected, actual);

        element = 120;
        expected = -1;
        actual = logic.binarySearch(arr, element);

        Assert.assertEquals(expected, actual);

        element = -120;
        expected = -1;
        actual = logic.binarySearch(arr, element);

        Assert.assertEquals(expected, actual);
    }

    private void printArray(int[] array){
        System.out.print("\n");
        if (array.length == 0) {
            System.out.println("Empty array");
        }
        for (int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}