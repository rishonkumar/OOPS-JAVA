package classessandobjects;

public class Student {

//    Student properties
    String name;
    private int rollNumber;

    public  int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if(rollNumber <= 0) return;

        System.out.println("this " + this);
        this.rollNumber = rollNumber;
    }
}
