import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment3 {
    public static void main(String[] args) {

        Set<String> strs = new LinkedHashSet<>();
        strs.add("red");
        strs.add("green");
        strs.add("blue");
        strs.add("yellow");

        String[] strsArray = new String[strs.size()];
        strs.toArray(strsArray);

        System.out.print("As an array: ");
        for(String str: strsArray) System.out.print(str + " ");

        Set<String> strsSet = new LinkedHashSet<>();
        strsSet.addAll(Arrays.asList(strsArray));

        System.out.println(strsSet);
    }
}

