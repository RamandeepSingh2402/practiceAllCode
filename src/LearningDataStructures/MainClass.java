package LearningDataStructures;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstItem = "Ram";
        String secondItem = "Sham";
        String thirdItem = "Kaam";
        String fourthItem = "Roti";
        String fifthItem = "Paani";
        String sixthItem = "Khaao";
        LinkedList list = new LinkedList();

        //Adding the elements in the LinkedList
        list.add(list, firstItem);
        list.add(list, secondItem);
        list.add(list, thirdItem);
        list.add(list, fourthItem);
        list.add(list, fifthItem);
        list.add(list, sixthItem);

        //Printing the LinkedList
        list.print(list);
    }
}
