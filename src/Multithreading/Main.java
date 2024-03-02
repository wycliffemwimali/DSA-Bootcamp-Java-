package Multithreading;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//        obj2.setPriority(Thread.NORM_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
