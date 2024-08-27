import java.util.Iterator;
import java.util.Vector;

public class Assignment1    {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers.get(2));

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext())    {
            System.out.println(itr.next());
        }
    }
}