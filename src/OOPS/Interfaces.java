package OOPS;

public class Interfaces implements Cars, Persons{
    public static void main(String[] args) {

    }

    // @Override annotation lets the compiler know that the following function is meant to be overridden.

    @Override
    public void start(){
        System.out.println("My car is starting");
    }

    @Override
    public void walk(){
        System.out.println("My car can walk as well");
    }
}

interface Cars{
    void start();
}
interface Persons{
    void walk();
}