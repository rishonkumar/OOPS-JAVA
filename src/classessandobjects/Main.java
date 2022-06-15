package classessandobjects;

public class Main {

    public static void main(String[] args) {

        Student1 s2 = new Student1();

        Student1 s1 = new Student1(31,"Rishon", 88);

        s1.greeting();
        s1.changeName("Rishon kumar");
        s1.greeting();

        s2.greeting();
    }
}


class Student1 {
    int rollNo;
    String name;
    float marks = 90;

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    //Constructor

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object

    Student1() {
        this.rollNo = 31;
        this.name = "r";
        this.marks = 55.5f;
    }

    // Student arpit = new Student(17,"arpit",87.f)
    // here, this will be replaced with arpit
    Student1(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }


}
