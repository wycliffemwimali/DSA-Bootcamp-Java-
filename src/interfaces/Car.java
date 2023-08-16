package interfaces;

public class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("I brake normally");

    }

    @Override
    public void start() {
        System.out.println("I start normally");

    }

    @Override
    public void stop() {
        System.out.println("I stop normally");

    }

    @Override
    public void accelerate() {
        System.out.println(("I accelerate normally"));

    }
}
