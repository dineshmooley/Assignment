import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment1    {
    public static void main(String[] args) {

        Queue<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");

        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext())    {
            System.out.println(itr.next());
        }
    }
}