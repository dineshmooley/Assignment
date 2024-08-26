import java.util.ArrayList;
import java.util.Iterator;

public class Assignment2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        Iterator<Integer> itr = arr.iterator();

        while(itr.hasNext())    {

            Integer i = itr.next();
            if(i > 30)  itr.remove();
            else System.out.println(i);

        }

    }

}
