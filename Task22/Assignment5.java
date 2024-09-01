import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment5 {
    public static void main(String[] args) {


        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length())  {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        };

        Set<String> Strings = new TreeSet<>(comparator);

        Strings.add("banana");
        Strings.add("apple");
        Strings.add("cherry");
        Strings.add("date");

        System.out.println(Strings);

    }
}
