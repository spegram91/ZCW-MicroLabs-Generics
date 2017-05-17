package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int afterLast;

    public ObjectStack() {
        elements = new Object[10];
        afterLast = 0;
    }

    public void push (Object o){
        if(afterLast == elements.length) {
            elements = Arrays.copyOf(elements, elements.length);
        }
        elements[afterLast++] = o;
    }

    public Object pop (){
        return elements[--afterLast];
    }

    public boolean isEmpty(){
        return afterLast == 0;
    }
}
