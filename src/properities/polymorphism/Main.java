package properities.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Circle c = new Circle();
        Square sq = new Square();

        Shapes sq1 = new Square();

        s.area();
        c.area();
        sq.area();

    }
}
