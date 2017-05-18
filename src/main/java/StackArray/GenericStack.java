package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int afterLast;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[0];
        afterLast = 0;
    }

    public void push(E e) {
        if (afterLast == elements.length) {
            elements = Arrays.copyOf(elements, afterLast);
        }
        elements[afterLast] = e;
        afterLast++;
    }

    public E pop(){
        afterLast--;
        E e = elements[afterLast];
        elements = Arrays.copyOfRange(elements, 0, afterLast);
        return e;
    }

    public boolean isEmpty(){
        return afterLast == 0;
    }
}
