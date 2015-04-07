package c.mars;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static int sum(List<Integer> list, Predicate<Integer> sel) {
        int r = 0;
        for (Integer i:list){
            if(sel.test(i)) {
                r+=i;
                System.out.println(i);
            }
        }
        return r;
    }

    public static class P implements Predicate<Integer>{

        @Override
        public boolean test(Integer i) {
            return i>4&&i<8;
        }
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream()
//                .filter(x -> x > 4 && x < 8)
//                .reduce(0, (a, b) -> a + b)); //sum
//                .forEach(System.out::println); //print each

        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        Stream<Integer> stream = Stream.of(a);
        stream
                .filter(x -> x>2&&x<6)
                .forEach(System.out::println);
    }
}
