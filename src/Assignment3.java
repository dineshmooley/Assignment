import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your phone number: ");
        String phNum = sc.next();

        int i=0;
        try {
            for (; i < phNum.length(); i++) {
                if (!Character.isDigit(phNum.charAt(i))) throw new NotNumberException();
            }

            System.out.println("Thank you!");
        }
        catch (NotNumberException e)    {
            System.out.println("Error: " + e + ". '" + phNum.charAt(i) + "' What is this?");
        }
    }
}

class NotNumberException extends Exception  {

    public String toString()    {
        return "Your phone number is not valid";
    }

}
