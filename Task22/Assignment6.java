import java.util.TreeSet;
import java.util.Set;

public class Assignment6 {
    public static void main(String[] args) {

        TreeSet<Double> doubles = new TreeSet<>();

        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        doubles.add(4.4);
        doubles.add(5.5);

        System.out.println(doubles.first());
        System.out.println(doubles.last());
        System.out.println(doubles.higher(3.3));
        System.out.println(3.3);

    }
}
