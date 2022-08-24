package OOPS;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //creating first person
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Anuj";

        //printing the details of the first object
        System.out.println(p1.age + " " + p1.name);

        //creating the second object of the Person class
        Person p2 = new Person(31, "Shivam Sharma");

        //printing the details of the second person
        System.out.println(p2.age + " " + p2.name);

        //calling different methods of the existing persons
        p1.eat();
        p2.walk();
        p2.walk(2);

        //calling "count" which is the property of the Person class now instead of the object
        System.out.println(Person.count);
    }
}

class Person {
    String name;
    int age;
    static int count;

    public Person(){
        count++;
        System.out.println("Creating an object.");
    }
    public Person(int newAge, String newName){
        this();
        this.name = newName;
        this.age = newAge;
    }

    void walk(){
        System.out.println( name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps.");
    }
}