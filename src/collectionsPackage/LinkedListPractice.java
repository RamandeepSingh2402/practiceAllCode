package collectionsPackage;
import java.util.LinkedList;
import java.util.List;
public class LinkedListPractice {
    public static void main(String[] args) {
        //creating a new LinkedList
        List<String> names = new LinkedList<>();
        //adding different names in the "names" LinkedList
        names.add("Ramandeep");
        names.add("Alakh");
        names.add("Bedi");
        names.add("Gagan");
        //Printing the names LinkedList to check the added names;
        System.out.println("Initial LinkedList (Hell is about to break loose!!) " + names);
        //Starting to remove the names from the names linkedList
        names.remove(1);
        //Printing the names linkedlist to check the updated list
        System.out.println("Updated LinkedList after the implementation of the .remove() method " + names);
        //Creating a new LinkedList to merge both of the linkedlists
        List<String> namesOfStuds = new LinkedList<>();
        //Adding few names to the new LinkedList
        namesOfStuds.add("Ram");
        namesOfStuds.add("Sham");
        namesOfStuds.add("Naam");
        namesOfStuds.add("Hrami");
        //Trying to merge both of the LinkedLists
        namesOfStuds.addAll(names);
        //Printing "namesOfStuds" to check the changes
        System.out.println("This is the combined/merged LinkedList: " + namesOfStuds);
        //Trying to print the element at the index of 4 using getters in the namesOfStuds
        System.out.println("The fifth element in the combined LinkedList is: " + namesOfStuds.get(4));
        //Trying out the set method for the LinkedList "namesOfStuds"
        namesOfStuds.set(0, "FIRST NAME");
        //Printing the "namesOfStuds" LinkedList in order to check the affect of the .set() method
        System.out.println("Testing the .set() method: " + namesOfStuds);
        // Trying to clear the "namesOfStuds"
        namesOfStuds.clear();
        System.out.println("Cleared LinkedList: " + namesOfStuds);

    }
}
