import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Assignment3 {
    public static void main(String[] args) {

        Vector<String> str = new Vector<>();
        str.add("red");
        str.add("green");
        str.add("blue");
        str.add("yellow");

        String[] stringArr = str.toArray(new String[0]);
        System.out.println("As an array: " + Arrays.toString(stringArr));

        Vector<String> ansStr = new Vector<>();
        Collections.addAll(ansStr, stringArr);

        System.out.println("As a vector: " + ansStr);
    }
}
