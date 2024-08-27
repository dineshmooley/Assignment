import java.util.Scanner;
import java.util.Stack;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paranthesis = sc.next();

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<paranthesis.length(); i++)   {
            char currElement = paranthesis.charAt(i);
            if(currElement == '(')  stack.push('(');
            else {
                if(stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                else stack.pop();
            }
        }
        if(stack.isEmpty()) System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }
}