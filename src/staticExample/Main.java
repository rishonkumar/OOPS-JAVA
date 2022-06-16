package staticExample;

public class Main {

    public static void main(String[] args) {

//        Human population is common for all human it doesnt change for each human
//        does not depend on object
//        proprties that are not relted to objects  are called static methods or variable

        human rishon = new human(22,"Rishon",10000,false);
        human xyz = new human(22,"xyz",10000,true);

//        System.out.println(rishon.population);
//        System.out.println(xyz.population);

        System.out.println(human.population);

        //Static are not depended on objects you can still use it
        //Static means you can use main method/function without creating object of that class
        //So to run main we have used static

//        gretting(); error coz of non static
    }

    // this is not dependent on objects
    static void func() {
       // gretting(); you cant use this because it requires an instance
        //but the function you are using it in does not depend on instance

        // you cannot access non static stuff without referencing thier instance in
        // a static context

        Main obj = new Main();
        obj.gretting();
    }


    // we know that something which is not static belongs to an object
    void gretting() {
        System.out.println("Hello world");
    }

}
