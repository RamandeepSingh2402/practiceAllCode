package OOPS;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Anuj";
        System.out.println(p1.age + " " + p1.name);

        Person p2 = new Person();
        p2.name = "Shivam";
        p2.age = 25;
        System.out.println(p2.age + " " + p2.name);

        p1.eat();
        p2.walk();
        p2.walk(2);
    }
}

class Person {
    String name;
    int age;
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