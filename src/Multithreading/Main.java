package Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
//        A obj1 = new A();
//        B obj2 = new B();

//        using lambda expressions
//        Runnable obj1 = () -> {
//            for(int i=1; i<=5;i++){
//                System.out.println("hi");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Runnable obj2 = () -> {
//            for(int i=1; i<=5;i++){
//                System.out.println("hello");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
        Runnable obj1 = () -> {
            for(int i=1; i<=5;i++){
               c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i=1; i<=5;i++){
                c.increment();
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
//        obj2.setPriority(Thread.NORM_PRIORITY);

//        obj1.start();
//        obj2.start();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
