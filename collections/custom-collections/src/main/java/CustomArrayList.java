import interfaces.ICustomArrayList;

import java.lang.reflect.Array;
import java.util.Collection;

public class CustomArrayList<E> implements ICustomArrayList<E> {
    private int currentPosition = 0;
    private int currentTotalSize = 0;
    private int initialSize = 10;
    private E[] internalArray;


    @Override
    public boolean add(E o) {
        try {
            if (internalArray == null) {
                currentTotalSize = initialSize;
                internalArray = (E[]) Array.newInstance(o.getClass(), currentTotalSize);
            }

            if (currentPosition >= currentTotalSize) {
                int previousSize = currentTotalSize;
                currentTotalSize += currentTotalSize > 0 ? currentTotalSize : initialSize;
                E[] internalSwapArray = (E[]) Array.newInstance(o.getClass(), currentTotalSize);
                System.arraycopy(internalSwapArray, 0, internalArray, 0, previousSize);
                internalArray = internalSwapArray;
            }

            internalArray[currentPosition] = o;
            currentPosition++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {
        if (internalArray == null) {
            currentTotalSize = initialSize;
            internalArray = (E[]) Array.newInstance(element.getClass(), currentTotalSize);
        }
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (internalArray[index] != null) {
            E[] rightArray = (E[]) Array.newInstance(element.getClass(), currentTotalSize - index);
            System.arraycopy(internalArray, index, rightArray, 0, currentTotalSize - index);
            System.arraycopy(rightArray, 0, internalArray, index + 1 , rightArray.length - 1);
        }
        internalArray[index] = element;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return internalArray[index];
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
        return internalArray == null ? 0 : internalArray.length;
    }
}
