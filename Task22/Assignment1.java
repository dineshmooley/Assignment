import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment1    {
    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        //Adding 15 again
        numbers.add(15);

        Iterator<Integer> itr = numbers.iterator();//5 10 15 20 25

        while (itr.hasNext()) System.out.print(itr.next() + " ");

    }
}