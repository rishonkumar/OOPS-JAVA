package classessandobjects;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //wrapper class - Integer
        Integer num = 45; // now it is created as object

        swap(a,b); // doesnt work
        System.out.println(a + " " + b);


        Integer a1 = 10;
        Integer b1 = 20;
        swap(a1,b1); // doesnt work coz of final class

        System.out.println(a1 + " " + b1);

        final int bonus = 2;
//        bonus = 3 ;  error

        final A rishon = new A("Rishon");
        rishon.name = "other name"; // you can do this
        // when a non-primitive is final, you cannot reassign it
        //not this
//        rishon = new A("other object");

    }

    static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    static void swap(Integer a, Integer b) {
        int t = a;
        a = b;
        b = t;
    }

}

class A {
    // final variable should be initialized
    final int num = 10;

    String name;
    public A (String name) {
        this.name  = name;
    }
}
