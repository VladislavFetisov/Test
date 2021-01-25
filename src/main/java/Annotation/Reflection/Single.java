package Annotation.Reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
    int myInt();
}

public class Single {

    @MySingle(myInt = 100)
    public static void myMath() throws NoSuchMethodException {
        Single ob=new Single();
        Method m=ob.getClass().getMethod("myMath");
        MySingle anno=m.getAnnotation(MySingle.class);
        System.out.println(anno.myInt());
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMath();
    }
}
