package Multithreading;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
//        obj2.setPriority(Thread.NORM_PRIORITY);

//        obj1.start();
//        obj2.start();
        t1.start();
        t2.start();
    }
}
