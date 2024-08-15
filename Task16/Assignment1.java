import java.util.Scanner;

public class Assignment1    {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            int n1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int n2 = sc.nextInt();
            if(n2 == 0) throw new MyException();
        }
        catch (MyException e)    {
            System.out.println("Error: " + e);
        }
    }
}

class MyException extends Exception {

    public String toString()    {
        return "Division is impossible with zero as the divisor";
    }

}
