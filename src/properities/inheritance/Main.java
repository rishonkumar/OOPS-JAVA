package properities.inheritance;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();

        System.out.println(box.l + " " + box.h + " " + box.w);

        Box b2 = new Box(4);

        Box b3 = new Box(4.5,5.6,7.8);

        Box b4 = new Box(b3);

        BoxWeight b5 = new BoxWeight();
        System.out.println(b5.weight); // -1 -1

        BoxWeight b6 = new BoxWeight(2,3,4,8);

        BoxPrice box23 = new BoxPrice(5,8,200);
    }
}
