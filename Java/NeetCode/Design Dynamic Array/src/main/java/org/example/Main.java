package org.example;

/**
DynamicArray(int capacity) will initialize an empty array with a capacity of capacity, where capacity > 0.
int get(int i) will return the element at index i. Assume that index i is valid.
void set(int i, int n) will set the element at index i to n. Assume that index i is valid.
void pushback(int n) will push the element n to the end of the array.
int popback() will pop and return the element at the end of the array. Assume that the array is non-empty.
void resize() will double the capacity of the array.
int getSize() will return the number of elements in the array.
int getCapacity() will return the capacity of the array.
 */


class DynamicArray {
    int[] array;
    int size = 0;
    int capacity;

    public DynamicArray(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {

    }

    public int popback() {
        return 0;
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
