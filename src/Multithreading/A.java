package Multithreading;

public class A extends Thread{
    public void run(){
        for(int i=1; i<=1000;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
