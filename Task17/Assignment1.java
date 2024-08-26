import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("grapes");

        int n = fruits.size();

        for(int i=0; i<n; i++)  {
            System.out.println(fruits.get(i));
        }

        System.out.println(fruits.get(2));
    }
}
