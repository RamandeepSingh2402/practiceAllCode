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

        //Taking in the two integers for adding them
        System.out.println("Kindly enter the two integers which you want to add: ");
        int a = in.nextInt();
        int b = in.nextInt();
        //Passing the collected integers in the Add method
        Add sum = new Add(a, b);

        //Printing the sum of the two numbers
        System.out.println("The sum of the two numbers is: " + sum);

        //Printing the LinkedList
        list.print(list);
    }

    //The Add method
    public static class Add {
        //Declaring and instantiating the variables
        public int firstNum;
        public int secondNum;
        public int sum;
        //Constructor
        public Add(int a, int b){
            this.firstNum = a;
            this.secondNum = b;
        }
        public String toString(){
            this.sum = this.firstNum + this.secondNum;
            return ""+this.sum;
        }
    }
//        //Printing the LinkedList
//        list.print(list);
    }

