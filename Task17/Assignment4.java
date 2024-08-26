import java.util.*;

public class Assignment4 {

    public static void main(String[] args) {
        List<Object> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        Object[] fruitsArray = fruits.toArray();
        System.out.print("As an array: ");
        System.out.println(Arrays.toString(fruitsArray));

        fruits = Arrays.asList(fruitsArray);
        System.out.println("As an ArrayList: " + fruits.toString());
    }

}
