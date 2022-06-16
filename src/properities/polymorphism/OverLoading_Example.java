package properities.polymorphism;
//Method overloading
public class OverLoading_Example {

    int sum(int a, int b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        OverLoading_Example obj = new OverLoading_Example();
        obj.sum(2,3);
        obj.sum(2,3,4);
    }
}
