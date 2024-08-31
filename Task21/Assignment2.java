import java.util.PriorityQueue;
import java.util.Queue;

public class Assignment2 {
    public static void main(String[] args) {

        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        System.out.println(numbers.peek());
        numbers.remove();

        System.out.println(numbers);//  [2, 4, 3, 5]

    }
}