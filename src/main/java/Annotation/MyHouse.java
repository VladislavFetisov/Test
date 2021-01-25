package Annotation;

interface House {
    @Deprecated
    void open();

    void openFrontDoor();

    void openBackDoor();
}
public class MyHouse implements House {
    public void open() {}
    public void openFrontDoor() {}
    public void openBackDoor() {}

    public static void main(String[] args) {
        MyHouse myHouse=new MyHouse();
        myHouse.open();
    }
}

