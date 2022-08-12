//package TCS;
//
//import java.util.Scanner;
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//        Student[] students=new Student[4];
//
//        Scanner sc=new Scanner(System.in);
//
//        int in=sc.nextInt();sc.nextLine();
//
//        for (int i = 0; i <in ; i++) {
//
//            int a=sc.nextInt(); sc.nextLine();
//
//            String b=sc.nextLine();
//
//            int c=sc.nextInt();sc.nextLine();
//
//            int d=sc.nextInt();sc.nextLine();
//
//            students[i]  = new Student(a,b,c,d);
//
//        }
//
//        int input1=sc.nextInt();sc.nextLine();
//
//        Student ans1=findStudentWithMaximumAge(students);
//
//        System.out.println("id-"+ans1.id);
//
//        System.out.println("name-"+ans1.name);
//
//        System.out.println("marks-"+ans1.getMarks());
//
//        System.out.println("age-"+ans1.getAge());
//
//
//
//
//
//        Student ans2=searchStudentById(students,input1);
//
//        if(ans2==null)
//
//        {
//
//            System.out.println("No Student found with mentioned attribute.");
//
//        }
//
//        else
//
//        {
//
//            System.out.println("id-"+ans2.id);
//
//            System.out.println("name-"+ans2.name);
//
//            System.out.println("marks-"+ans2.getMarks());
//
//            System.out.println("age-"+ans2.getAge());
//
//
//
//        }
//
//
//
//    }
//
//
//
//    public static Student findStudentWithMaximumAge(Student[] students)
//
//    {
//
//        int max=students[0].age;
//
//
//
//        for (int i = 1; i <students.length ; i++) {
//
//            if(students[i].age>max)
//
//            {
//
//                max=students[i].age;
//
//            }
//
//        }
//
//        for (int i = 0; i <students.length ; i++) {
//
//            if(students[i].age==max)
//
//            {
//
//                return students[i];
//
//            }
//
//        }
//
//        return null;
//
//    }
//
//    public  static  Student searchStudentById(Student[] students,int input1)
//
//    {
//
//        for (int i = 0; i <students.length ; i++) {
//
//            if(students[i].id==input1)
//
//            {
//
//                return students[i];
//
//            }
//
//        }
//
//
//
//
//
//
//
//        return null;
//
//    }
//
//}
//
//
//
//class Student
//
//{
//
//    int id;
//
//    String name;
//
//    int marks;
//
//    int age;
//
//
//
//    //parametrized constructor
//
//
//
//
//
//    public Student(int id, String name, int marks, int age) {
//
//        this.id = id;
//
//        this.name = name;
//
//        this.marks = marks;
//
//        this.age = age;
//
//    }
//
//
//
//    //getters and setters
//
//
//
//
//
//    public int getId() {
//
//        return id;
//
//    }
//
//
//
//    public void setId(int id) {
//
//        this.id = id;
//
//    }
//
//
//
//    public String getName() {
//
//        return name;
//
//    }
//
//
//
//    public void setName(String name) {
//
//        this.name = name;
//
//    }
//
//
//
//    public int getMarks() {
//
//        return marks;
//
//    }
//
//
//
//    public void setMarks(int marks) {
//
//        this.marks = marks;
//
//    }
//
//
//
//    public int getAge() {
//
//        return age;
//
//    }
//
//
//
//    public void setAge(int age) {
//
//        this.age = age;
//
//    }
//
//}
