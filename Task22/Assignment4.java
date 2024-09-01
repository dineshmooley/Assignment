import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment4 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
