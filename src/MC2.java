import java.util.*;
public class MC2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        // { { 1, 1, 2, 3 }, { 4, 5, 6, 6 } } -> { 1, 1, 2, 3, 4, 5, 6, 6 }
       // { { 'A', 'B', 'C' }, { 'D', 'E' } } -> { 'A', 'B', 'C', 'D', 'E' }
        */

        Iterator<Iterator<Integer>> i1 = List.of(List.of(1, 2, 3).iterator(),

                List.of(4, 5, 6).iterator(), List.of(7, 8, 9).iterator()).iterator();
        Iterator<Integer> i1Flatten = flatten(i1);
        i1Flatten.forEachRemaining(System.out::print);
        System.out.println();

        Iterator<Iterator<String>> ia = List.of(List.of("a", "b", "c").iterator(),

                List.of("d", "e", "f").iterator()).iterator();

        Iterator<String> iaFlatten = flatten(ia);
        iaFlatten.forEachRemaining(System.out::print);
        System.out.println();
        Iterator<Iterator<Integer>> i2 = Arrays.asList(Collections.<Integer>emptyIterator(), Arrays.asList(1, 2, 3).iterator(),

                Collections.<Integer>emptyIterator(), Arrays.asList(4, 5, 6).iterator(), Collections.<Integer>emptyIterator(),

                Collections.<Integer>emptyIterator(), Arrays.asList(7, 8, 9).iterator(), Collections.<Integer>emptyIterator(),

                Collections.<Integer>emptyIterator()).iterator();

        Iterator<Integer> i2Flatten = flatten(i2);
        i2Flatten.forEachRemaining(System.out::print);
    }

    public static <T> Iterator<T> flatten(final Iterator<Iterator<T>> input) {
        return new Iterator<T>() {
            private Iterator<T> current = null;
            @Override
            public boolean hasNext() {
                while((current == null || !current.hasNext()) && input.hasNext()){
                    current = input.next();
                }
                return current!=null && current.hasNext();
            }

            @Override
            public T next() {
                if(!hasNext()){
                    throw  new NoSuchElementException("No more Elements");
                }
                return current.next();
            }
        };
    }
}