import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Assignment4 {
    public static void main(String[] args) {

        Stack<Double> stack = new Stack<>();
        stack.add(1.1);
        stack.add(2.2);
        stack.add(3.3);
        stack.add(4.4);
        stack.add(5.5);

        Double[] arr = stack.toArray(new Double[0]);
        Collections.reverse(Arrays.asList(arr));

        Stack<Double> reverse = new Stack<>();
        for(Double d: arr)  {
            reverse.push(d);
        }

        System.out.println(reverse);
    }
}
