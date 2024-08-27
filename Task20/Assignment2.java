import java.util.Stack;

public class Assignment2 {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String str = "hello";
        for(int i=0; i<str.length(); i++)   {
            stack.push(str.charAt(i));
        }

        String ans = "";

        while(!stack.isEmpty()) {
            ans += stack.peek();
            stack.pop();
        }

        System.out.println(ans);

    }
}