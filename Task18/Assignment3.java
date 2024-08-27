import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment3 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        for(int i=1; i<=10; i++)    {
            numbers.add(i);
        }

        ListIterator<Integer> itr = numbers.listIterator();
        int removeIndex1 = 2, removeIndex2 = numbers.size()-1;

        int index = 0;
        while(itr.hasNext())    {
            itr.next();
            if(index == removeIndex1 || index == removeIndex2)   itr.remove();
            else index++;
        }

    }
}
