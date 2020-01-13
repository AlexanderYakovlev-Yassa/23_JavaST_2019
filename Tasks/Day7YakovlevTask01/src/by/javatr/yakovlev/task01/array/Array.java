package by.javatr.yakovlev.task01.array;

import by.javatr.yakovlev.task01.array.exception.*;
import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;

public class Array implements Cloneable {

    private static final int WRONG_INDEX = -1;

    private final int[] array;
    public final int length;
    public boolean sorted;

    public Array(int[] array) throws NullArrayException {
        if (array == null || array.length == 0) {
            throw new NullArrayException("Can't create Array from null");
        }
        this.array = array;
        this.length = array.length;
        this.sorted = false;
    }

    public Array(int length) throws EmptyArrayException {
        if (length <= 0) {
            throw new EmptyArrayException("Array can't be empty");
        }
        this.array = new int[length];
        this.length = length;
        this.sorted = false;
    }

    public Array subArray(int fromIndex, int toIndex) throws ArrayIndexOutOfBoundException, NullArrayException, EmptyArrayException {

        if (length == 1) {

            if (array[0] == 0) {
                throw new EmptyArrayException("an attempt to create empty Array");
            }
            return new Array(array[0]);

        }
        if (fromIndex < 0 || fromIndex >= length || toIndex < 0 || toIndex >= length) {
            throw new ArrayIndexOutOfBoundException("an invalid boundary of the subArray");
        }
        if (fromIndex == toIndex) {
            return new Array(array[fromIndex]);
        }
        if (fromIndex > toIndex) {
            int bubble = fromIndex;
            fromIndex = toIndex;
            toIndex = bubble;
        }

        int[] subArr = new int[toIndex - fromIndex + 1];

        for (int i = 0; i < subArr.length; i++) {
            subArr[i] = array[i + fromIndex];
        }

        Array res = new Array(subArr);

        return res;
    }

    public int[] toIntArray() {
        return array;
    }

    public int getArrayElement(int index) {
        return this.array[index];
    }

    public void setArrayElement(int index, int element) {

        if (index < 0 || index >= length) {
            //EXCEPTIONS
        }

        this.array[index] = element;
        this.sorted = false;
    }

    public int getMaxElementIndex() {

        if (length == 1) {
            return 0;
        }

        int index = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }

        return index;
    }

    public int getMaxElement() {

        int index = this.getMaxElementIndex();

        return this.getArrayElement(index);
    }

    public int getMinElementIndex() {

        if (length == 1) {
            return 0;
        }

        int index = 0;

        for (int i = 1; i < length; i++) {
            if (this.getArrayElement(i) < this.getArrayElement(index)) {
                index = i;
            }
        }

        return index;
    }

    public int getMinElement() {

        int index = this.getMinElementIndex();

        return this.getArrayElement(index);
    }

    public void sort(boolean reverse) {
        //BODY
    }

    public void sort(ISortMethod method, boolean reverse) throws NullSortMethodException {

        if (method == null) {
            throw new NullSortMethodException("missing a sort method");
        }

        method.sort(this, reverse);
    }

    public int indexOf(int element) throws ArrayIndexOutOfBoundException {

        return indexOf(element, 0);
    }

    public int indexOf(int element, int fromIndex) throws ArrayIndexOutOfBoundException {

        if (fromIndex < 0 || fromIndex >= length) {
            throw new ArrayIndexOutOfBoundException("an invalid boundary");
        }

        for (int i = fromIndex; i < length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return WRONG_INDEX;
    }

    public int binarySearch(int element) throws NotSortedArrayException, ArrayIndexOutOfBoundException {

        if (!sorted) {
            throw new NotSortedArrayException("required a sorted array");
        }

        if (array.length == 1) {
            return 0;
        }

        int pos;
        if (getArrayElement(0) == element) {
            pos = 0;
        } else if (getArrayElement(array.length - 1) == element) {
            pos = array.length - 1;
        } else {
            pos = binarySearch(element, 0, array.length - 1);
        }

        return pos;
    }

    public int binarySearch(int element, int left, int right) throws ArrayIndexOutOfBoundException {

        int maxIndex = length - 1;

        if (left < 0 || left >= maxIndex || right < 0 || right >= maxIndex) {
            throw new ArrayIndexOutOfBoundException("an invalid boundary");
        }

        int pos;
        int center = left + (right - left) / 2;

        if (getArrayElement(center) == element) {
            pos = center;
        } else if (right - left == 1) {
            pos = -1;
        } else if (getArrayElement(center) < element) {
            pos = binarySearch(element, center, right);
        } else {
            pos = binarySearch(element, left, center);
        }

        return pos;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (this.getClass() != o.getClass()) {
            return false;
        }

        Array array = (Array) o;

        if (this.length != array.length) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (this.getArrayElement(i) != array.getArrayElement(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {

        final int PRIME = 31;
        int res = 1;

        for (int i : this.array) {
            res = res * PRIME + i;
        }

        return res;
    }

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder("(");

        res.append(this.getClass() + " {");

        for (int i : this.array) {
            res.append(i + ", ");
        }

        res.append("\b\b})");

        return res.toString();
    }


    //******************************************************************************************** REMOVE
    private void printArray(int[] array) {
        System.out.println("\n");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
