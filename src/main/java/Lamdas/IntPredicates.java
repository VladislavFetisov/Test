package Lamdas;

import Annotation.ClassPreamble;

//Исследование ссылок на статические методы.
@FunctionalInterface
interface IntPredicate {
    boolean test(int n);
}

@ClassPreamble(
        author = "Vladislav", date = "25.01.2021", reviewers = {})

public class IntPredicates {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean a;
        a = numTest(IntPredicates::isEven, 12);
        System.out.println(a);
    }
}


//Исследование ссылок на методы обьекта.
interface IntPredicate1 {
    boolean test(int n);
}

class MyInt {
    private int n;

    public MyInt(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    boolean isFactor(int v) {
        return (n % v) == 0;
    }
}

class MethodReferenceDemo {
    public static void main(String[] args) {
        MyInt first = new MyInt(12);
        MyInt second = new MyInt(4);

        IntPredicate1 ip = first::isFactor;
        System.out.println(ip.test(5));
    }
}