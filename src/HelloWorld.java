import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Hey!\nPlease enter your first name: ");
        String name = in.next();
        String name1 = "";
        LinkedList<String> names = new LinkedList<String>();
        names.add(name);
        System.out.println("Hey: " + names.get(0));
        System.out.println("I'm glad to see you!");
        System.out.println("So as anticipated, how can I help you today?");
        in.nextLine();
        String record = in.nextLine();
        in.nextLine();
        int count = 1;
        File firstVisit = new File("firstVisit.txt");
        FileWriter writer = new FileWriter("firstVisit.txt");

        while(!record.equalsIgnoreCase("done")) {
                writer.write(record);
                writer.close();
                record = in.nextLine();
            }
        }

    }
