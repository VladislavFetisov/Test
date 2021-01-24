package Lamdas;

//Пример использования лямбд в функциях.
@FunctionalInterface
interface StrFunc {
    String func(String str);
}

public class LambdaArgumentDemo {
    static String changeStr(StrFunc StrFunc, String str) {
        return StrFunc.func(str);
    }

    public static void main(String[] args) {
        int c=19;
        StrFunc strFunc = str -> {
            StringBuilder a = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                a.append(str.charAt(i));
            }
            return a.toString();
        };
        System.out.println(changeStr(strFunc,"123456"));
        System.out.println(c);
    }
}
