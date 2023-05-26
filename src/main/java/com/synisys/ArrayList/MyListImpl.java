package com.synisys.ArrayList;

import java.util.Arrays;
import java.util.Objects;

public class MyListImpl implements MyList {

    private Integer[] arr;
    private int index = 0;
    private int capacity = 10;

    public MyListImpl() {
        this.arr = new Integer[this.capacity];
    }

    @Override
    public void add(Integer element) {
        checkAndIncreaseCapacity();
        arr[index++] = element;
    }

    @Override
    public void add(int index, Integer element) {
        validateIndexInCaseOfAddElement(index);
        checkAndIncreaseCapacity();
        moveRight(index);

        arr[index] = element;
    }

    @Override
    public Integer get(int index) {
        validateIndex(index);

        return this.arr[index];
    }

    @Override
    public void remove(int index) {
        validateIndex(index);
        moveLeft(index);
    }

    @Override
    public boolean contains(Integer element) {
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(Integer element) {
        for (int i = 0; i < index; i++) {
            if (Objects.equals(arr[i], element)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public boolean isEmpty() {
        return this.index == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.size(); i++) {
            stringBuilder.append(arr[i]);
            if (i != this.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    private void checkAndIncreaseCapacity() {
        if (this.index == this.capacity) {
            capacity = capacity * 2;
            arr = Arrays.copyOf(arr, capacity);
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException("Given index is big than list's size");
        }
    }

    private void validateIndexInCaseOfAddElement(int index) {
        if (index < 0 || index > this.index) {
            throw new ArrayIndexOutOfBoundsException("Given index is big than list's size");
        }
    }

    private void moveRight(int index) {
        if (index < this.index) {
            for (int i = this.index; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            this.index++;
        }
    }

    private void moveLeft(int index) {
        for (int i = index; i < this.index - 1; i++) {
            arr[i] = arr[i + 1];
        }

        this.index--;
    }
}
