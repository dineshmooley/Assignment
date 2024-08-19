import java.util.Scanner;

public class Assignment1    {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            int n1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int n2 = sc.nextInt();

            System.out.println("Answer is: " + n1/n2);
        }
        catch (ArithmeticException e)    {
            System.out.println("Error: " + e);
        }
    }
}
