package by.javatr.yakovlev.task01.array;

import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;

public class Array implements Cloneable{

    private static final int[] EMPTY_ARRAY = new int[0];
    private static final int ZERO = 0;
    private static final int WRONG_INDEX = -1;

    private final int[] array;
    public final int length;

    public Array(int[] array) {

        if (array != null){
            this.array = array;
            this.length = array.length;
        } else {
            this.array = EMPTY_ARRAY;
            this.length = ZERO;
        }
    }

    public Array(int length) {
        if (length == ZERO){
            this.array = EMPTY_ARRAY;
            this.length = ZERO;
        } else {
            this.array = new int[length];
            this.length = length;
        }
    }

    public Array subArray(int fromIndex, int toIndex){
        if (array == EMPTY_ARRAY){
            return new Array(ZERO);
        }
        if (length == 1){
            return new Array(array[0]);
        }
        if (fromIndex < 0 || fromIndex >= length || toIndex < 0 || toIndex >= length){
            throw new IndexOutOfBoundsException("Invalid index of an array element");
        }
        if (fromIndex == toIndex){
            return new Array(array[fromIndex]);
        }
        if (fromIndex > toIndex){
            int bubble = fromIndex;
            fromIndex = toIndex;
            toIndex = bubble;
        }

        int[] subArr = new int[toIndex - fromIndex + 1];

        for (int i = 0; i < subArr.length; i++){
            subArr[i] = array[i + fromIndex];
        }

        Array res = new Array(subArr);

        return res;
    }

    public boolean isEmpty(){
        return array == EMPTY_ARRAY;
    }

    public int[] toIntArray() {
        return array;
    }

    public int getArrayElement(int index) {
        return this.array[index];
    }

    public boolean setArrayElement(int index, int element) {

        if (index < 0 || index >= length){
            return false;
        }

        this.array[index] = element;
        return true;
    }

    public int getMaxElementIndex(){

        if (isEmpty()){
            return WRONG_INDEX;
        }
        if (length == 1){
            return 0;
        }

        int index = 0;

        for (int i = 0; i < length; i++){
            if (array[i] > array[index]){
                index = i;
            }
        }

        return index;
    }

    public int getMaxElement(){

        int index = this.getMaxElementIndex();

        return this.getArrayElement(index);
    }

    public int getMinElementIndex(){

        if (isEmpty()){
            return WRONG_INDEX;
        }
        if (length == 1){
            return 0;
        }

        int index = 0;

        for (int i = 1; i < length; i++){
            if (this.getArrayElement(i) < this.getArrayElement(index)){
                index = i;
            }
        }

        return index;
    }

    public int getMinElement(){

        int index = this.getMinElementIndex();

        return this.getArrayElement(index);
    }

    public void sort(ISortMethod method, boolean reverse){

        method.sort(this, reverse);
    }

    public int indexOf(int element){

        return indexOf(element, 0);
    }

    public int indexOf(int element, int fromIndex){

        for (int i = fromIndex; i < length; i++) {
            if (array[i] == element){
                return i;
            }
        }

        return WRONG_INDEX;
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

        for (int i : this.array){
            res.append(i + ", ");
        }

        res.append("\b\b})");

        return res.toString();
    }


//******************************************************************************************** REMOVE
    private void printArray(int[] array){
        System.out.println("\n");
        for (int i: array){
            System.out.print(i + " ");
        }
    }
}
