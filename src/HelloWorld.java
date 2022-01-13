import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Hey!\nPlease enter your first name: ");
        String name = in.next();
        System.out.println("Hey: " + name);
    }
}
