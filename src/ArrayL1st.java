import java.util.ArrayList;
import java.util.List;

public class ArrayL1st {
    public static void main(String[] args) {

        //initialise a list
        List<String> groceries = new ArrayList<String>();
        groceries.add("apple");
        groceries.add("banana");
        groceries.add("carrots");
        groceries.add("olive oil");
        groceries.add("avocados");

        //print length of array
        System.out.println("Number of groceries: " + groceries.size());

        //print out all groceries
        for(String item : groceries){
            System.out.print(item + ", ");
        }
        System.out.println();

        //retrieve element in constant time
        System.out.println("grocery item at index 3: " + groceries.get(3));

        //remove element
        groceries.remove(0);

        //check length
        System.out.println("Number of groceries: " + groceries.size());

        //print out elements again
        for(String item : groceries){
            System.out.print(item + ", ");
        }
    }
}
