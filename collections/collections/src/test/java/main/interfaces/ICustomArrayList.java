package main.interfaces;

import java.util.Collection;

public interface ICustomArrayList<E> {
    /**
     * Appends the specified element to the end of this list .
     * @param e The element to add
     * @return true if added successfully, false if not
     */
    boolean add(E e);

    /**
     *
     * @param index
     * @param element
     */
    void add(int index, E element);

    boolean addAll(Collection<? extends E> c);

    void clear();


    boolean contains(Object o);


    int indexOf(Object o);

    boolean isEmpty();

    E remove(int index);

    int size();
}
