import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment2 {
    public static void main(String[] args) {

        Set<Character> characters = new LinkedHashSet<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        
        characters.remove('C');

        System.out.println(characters);//  [A, B, D, E]

    }
}