package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        //to set the price of the laptop we're using setPrice method
        l1.setPrice(12);

        // to print the price of the laptop, we'll be using getPrice
        System.out.println("The price of the laptop is: " + l1.getPrice());
    }
    public void doWork(){
        System.out.println(" working working ");
    }
}

class Laptop{
    int ram;
    private int price;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        // for validation we can do, if the user is an admin or not
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("You cannot set the price of the laptop");
        }
        else {
            this.price = price;
        }
    }


}