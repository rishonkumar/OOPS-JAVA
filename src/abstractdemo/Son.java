package abstractdemo;

public class Son extends Parent{

    @Override
    void carrer(String name) {
        System.out.println("I am going to be a" + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " she is " + age);
    }
}
