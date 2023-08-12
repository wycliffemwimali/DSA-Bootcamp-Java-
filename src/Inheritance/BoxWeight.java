package Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -3;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//initialize values in the parent class
        this.weight = weight;
    }
}
