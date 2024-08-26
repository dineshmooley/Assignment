import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        arr.add('e');
        arr.add('f');
        arr.add('g');

        char n = sc.next().charAt(0);
        if(arr.contains(n)) System.out.println(arr.indexOf(n));
        else System.out.println(-1);
    }

}
