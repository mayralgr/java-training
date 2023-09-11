package main;

import main.interfaces.ICustomArrayList;

import java.lang.reflect.Array;
import java.util.Collection;

public class CustomArrayList<E> implements ICustomArrayList<E> {
    private E[] internalArray;
    private int currentPosition = 0;
    private int currentTotalSize;

    public CustomArrayList() {
        internalArray = (E[]) Array.newInstance(internalArray.getClass(), currentTotalSize);
    }

    /*public CustomArrayList(Class<E> type, int capacity) {
        currentTotalSize = capacity;
        internalArray = (E[]) Array.newInstance(type,capacity);
    }*/

    @Override
    public boolean add(E o) {
        if(currentPosition < internalArray.length)
        {
            internalArray[currentPosition] = o;
            return true;
        }
        else
        {
            // recreate array ;
            ;
        }
        return false;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
