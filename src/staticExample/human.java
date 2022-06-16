package staticExample;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello world");
        // you can not use this inside static
//        System.out.println(this.age); // error this is object
    }
    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population +=1;

        human.message();
    }
}
