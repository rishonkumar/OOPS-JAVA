package classessandobjects;

import java.util.Scanner;

public class StudentUse {

    public static void main(String[] args) {

//        to create object of Student
        Student s1 = new Student();

        System.out.println(s1); // it will print address of object s1

//        TO access properties of that object
//        System.out.println(s1.name + " " + s1.rollNumber);

        s1.name = "Rishon";
//        s1.rollNumber = 10;

//        System.out.println(s1.name + " " + s1.rollNumber);

        System.out.println(s1.name + " " + s1.getRollNumber());

        s1.setRollNumber(100);

        System.out.println(s1.name + " " + s1.getRollNumber());

        System.out.println("s1 " + s1);

    }
}
