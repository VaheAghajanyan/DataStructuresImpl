package com.synisys.ArrayList;

public interface MyList {
    void add(Integer element);

    void add(int index, Integer element);

    Integer get(int index);

    void remove(int index);

    boolean contains(Integer element);

    int indexOf(Integer element);

    int size();

    boolean isEmpty();
}
