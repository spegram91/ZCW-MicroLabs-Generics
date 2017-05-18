package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<R> map(ArrayList<T> theList, Function<T,R> function){
        ArrayList<R> result = new ArrayList<>();
        for(T item : theList){
            result.add(function.apply(item));
        }
        return result;
    }
}
