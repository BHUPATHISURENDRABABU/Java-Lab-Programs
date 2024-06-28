import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {

        //Initialize ArrayList without Elements and fixed datatype as String
        ArrayList<String> arr = new ArrayList<>();

        //Adding Element to ArrayList
        arr.add("Suri");
        arr.add("Shiva");
        arr.add("Narendra");
        arr.add("Mahesh");
        arr.add("Shiva");

        //Removing elements by index
        arr.remove(3);

        //Get Value by Index
        System.out.println(arr.get(1));

        //Set Value by Postion
        arr.set(2,"Sajid");

        //Get Index of particular value
        System.out.println(arr.indexOf("Shiva"));

        //Last Occurance Index of element
        System.out.println(arr.lastIndexOf("Shiva"));

        System.out.println(arr);

    }
}