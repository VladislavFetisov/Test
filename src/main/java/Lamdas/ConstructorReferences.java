package Lamdas;

interface MyFunc {
    MyClass func(String s);
}

class MyClass {
    private String str;

    MyClass(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "str='" + str + '\'' +
                '}';
    }

    public String append(String s) {
        return str + s;
    }
}

public class ConstructorReferences {
    public static void main(String[] args) {
        MyFunc classConst = MyClass::new;
        System.out.println(classConst.func("Признание"));

    }
}
