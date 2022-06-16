package properities.inheritance;

public class Box {
    double l;
    double h;
    double w;
    // double weight;
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void info() {
        System.out.println("Running the box");
    }
}
