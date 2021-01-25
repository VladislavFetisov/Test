package Lamdas;

import java.util.function.Predicate;

public class CompleteInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> isUneven = integer -> (integer <= 20 && integer >= 10);
        System.out.println(isUneven.test(11));
        Numeric<Integer> numeric= Integer::equals;
        System.out.println(numeric.test(1,2));
    }
}
@FunctionalInterface
interface Numeric<T>{
     boolean test(T a,T b);
}
