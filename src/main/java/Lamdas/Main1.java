package Lamdas;

@FunctionalInterface
interface Testable {
    int test(Integer a, Integer b);
}
interface StringTest {
    int test(String aStr, String bStr);
}
public class Main1 {
    public static void main(String[] args) {
        StringTest isln = (aStr, bStr) -> {
            StringBuilder a=new StringBuilder();
            a.append(aStr);
            a.append(" ");
            return a.indexOf(bStr);
        };
        System.out.println(isln.test("123","23 "));
        Testable testable= Integer::sum;
        System.out.println(testable.test(1,2));
    }
}