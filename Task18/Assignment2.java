import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment2{
    public static void main(String[] args) {

        LinkedList<String> numbersString = new LinkedList<>();
        numbersString.add("one");
        numbersString.add("two");
        numbersString.add("three");
        numbersString.add("four");
        numbersString.add("five");

        ListIterator<String> litr = numbersString.listIterator();

        while(litr.hasNext())   {
            if(litr.next().equals("three")) litr.set("THREE");
        }

        litr = numbersString.listIterator();
        while(litr.hasNext())   {
            System.out.println(litr.next());
        }

    }
}
