import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment4 {
    public static void main(String[] args) {

        LinkedList<Character> chars = new LinkedList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');

        ListIterator<Character> forward = chars.listIterator();
        ListIterator<Character> backward = chars.listIterator(chars.size());

        for(int i=0; i<chars.size()/2; i++) {
            Character forw = forward.next();
            Character back = backward.previous();
            forward.set(back);
            backward.set(forw);
        }

        forward = chars.listIterator();
        while(forward.hasNext()) System.out.println(forward.next());

    }
}
