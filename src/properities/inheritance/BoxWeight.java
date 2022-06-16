package properities.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l,h,w); // what is this? call the parent class constructor
        // used to initialise values present in parent class

//        System.out.println(this.weight);
//        System.out.println(super.weight); it prints parent class weight

        this.weight = weight;
    }

}
