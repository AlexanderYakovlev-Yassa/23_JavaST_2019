package by.javatr.yakovlev.task01.array;

import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;
import by.javatr.yakovlev.task01.service.ServiceFactory;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    @Test
    public void equalsTest() {

        Array arr1 = new Array(new int[]{1, 2, 3, 4, 5});
        Array arr2 = new Array(new int[]{1, 2, 3, 4, 5});
        Array arr3 = new Array(new int[]{1, 2, 3, 5, 5});
        Array arr4 = new Array(new int[]{1, 2, 3, 5});
        Array arr5 = null;
        int[] arr6 = new int[]{1, 2, 3, 4, 5};

        boolean actual_1 = arr1.equals(arr1);
        boolean actual_2 = arr1.equals(arr2);
        boolean actual_3 = arr1.equals(arr3);
        boolean actual_4 = arr1.equals(arr4);
        boolean actual_5 = arr1.equals(arr5);
        boolean actual_6 = arr1.equals(arr6);

        Assert.assertEquals(true, actual_1);
        Assert.assertEquals(true, actual_2);
        Assert.assertEquals(false, actual_3);
        Assert.assertEquals(false, actual_4);
        Assert.assertEquals(false, actual_5);
        Assert.assertEquals(false, actual_6);
    }

    @Test
    public void hashCodeTest() {

        Array arr1 = new Array(new int[]{1, 2, 3, 4, 5});
        Array arr2 = new Array(new int[]{1, 2, 3, 4, 5});
        Array arr3 = new Array(new int[]{1, 2, 3, 5, 5});

        int actual_1 = arr1.hashCode();
        int actual_2 = arr2.hashCode();
        int actual_3 = arr3.hashCode();

        System.out.println(actual_1);
        System.out.println(actual_2);
        System.out.println(actual_3);

        Assert.assertTrue(actual_1 == actual_2);
        Assert.assertFalse(actual_1 == actual_3);
    }

    @Test
    public void getMaxElementIndexTest() {

        Array arr = new Array(new int[]{1, 2, 30, 4, 5});

        int excepted = 2;
        int actual = arr.getMaxElementIndex();

        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void getMaxElementTest() {

        Array arr = new Array(new int[]{1, 2, 30, 4, 5});

        int excepted = 30;
        int actual = arr.getMaxElement();

        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void getMinElementIndexTest() {

        Array arr = new Array(new int[]{1, 2, 30, -4, 5});

        int excepted = 3;
        int actual = arr.getMinElementIndex();

        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void getMinElementTest() {
        Array arr = new Array(new int[]{1, 2, 30, -4, 5});

        int excepted = -4;
        int actual = arr.getMinElement();

        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void subArrayTest_1() {
        Array arr = new Array(new int[]{1, 2, 30, -4, 5, 12, 0, 48});

        Array expected = new Array(new int[]{30, -4, 5, 12});
        Array actual = arr.subArray(2, 5);

        Assert.assertTrue(expected.equals(actual));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void subArrayTest_2() {
        Array arr = new Array(new int[]{1, 2, 30, -4, 5, 12, 0, 48});

        Array expected = null;
        Array actual = arr.subArray(-2, 5);

        Assert.assertEquals(expected, actual);

        actual = arr.subArray(2, 50);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortBySelectTest() {

        ServiceFactory factory = ServiceFactory.getInstance();
        ISortMethod select = factory.getSelectSortMethod();

        boolean res = true;
        Array arr = new Array(new int[]{1, 2, 30, -4, 5});
        System.out.println(arr.toString());
        arr.sort(select, false);
        System.out.println(arr.toString());

        for (int i = 1; i < arr.length; i++) {
            if (arr.getArrayElement(i - 1) < arr.getArrayElement(i)) {
                res = false;
                break;
            }
        }

        Assert.assertTrue(res);

        arr = new Array(new int[]{1, 2, 30, -4, 5});
        arr.sort(select, true);
        System.out.println(arr.toString());

        res = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr.getArrayElement(i - 1) > arr.getArrayElement(i)) {
                res = false;
                break;
            }
        }

        Assert.assertTrue(res);
    }

    @Test
    public void sortByBubbleTest() {

        ServiceFactory factory = ServiceFactory.getInstance();
        ISortMethod bubble = factory.getBubbleSortMethod();

        boolean res = true;
        Array arr = new Array(new int[]{1, 2, 30, -4, 5});
        System.out.println(arr.toString());
        arr.sort(bubble, false);
        System.out.println(arr.toString());

        for (int i = 1; i < arr.length; i++) {
            if (arr.getArrayElement(i - 1) < arr.getArrayElement(i)) {
                res = false;
                break;
            }
        }

        Assert.assertTrue(res);

        arr = new Array(new int[]{1, 2, 30, -4, 5});
        arr.sort(bubble, true);
        System.out.println(arr.toString());

        res = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr.getArrayElement(i - 1) > arr.getArrayElement(i)) {
                res = false;
                break;
            }
        }

        Assert.assertTrue(res);

        arr = new Array(new int[]{1});
        Array expectedArr = new Array(new int[]{1});

        Assert.assertTrue(arr.equals(expectedArr));
    }

    @Test
    public void sortByCombTest() {

        ServiceFactory factory = ServiceFactory.getInstance();
        ISortMethod comb = factory.getCombSortMethod();

        boolean res = true;
        Array arr = new Array(new int[]{1, 2, 30, -4, 5, 25, 69, -78, 0, 125, -987, 32, 14, 2});
        System.out.println(arr.toString());
        arr.sort(comb, false);
        System.out.println(arr.toString());

        for (int i = 1; i < arr.length; i++) {
            if (arr.getArrayElement(i - 1) < arr.getArrayElement(i)) {
                res = false;
                break;
            }
        }

        Assert.assertTrue(res);

        arr = new Array(new int[]{1, 2, 30, -4, 5, 25, 69, -78, 0, 125, -987, 32, 14, 2});
        arr.sort(comb, true);
        System.out.println(arr.toString());

        res = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr.getArrayElement(i - 1) > arr.getArrayElement(i)) {
                res = false;
                break;
            }
        }

        Assert.assertTrue(res);
    }
}