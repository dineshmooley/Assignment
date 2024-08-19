import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        while (true)    {
            System.out.println("----------------------------------------------------------------");
            System.out.println("What do you want to do?");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Quit");

            System.out.println("Enter your choice: ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Current balance is: " + b.checkBalance());
                    break;

                case 2:
                    System.out.println("Please Enter the money you want to deposit: ");
                    int money = sc.nextInt();

                    b.deposit(money);
                    System.out.println("The amount has been deposited");
                    break;

                case 3:
                    System.out.println("Please Enter the money you want to withdraw: ");
                    int withdrawMoney = sc.nextInt();

                    b.withdraw(withdrawMoney);

                    break;

                case 4:
                    return;
            }

        }
    }
}

class Bank  {
    private int money;

    int checkBalance()  {
        return money;
    }

    void deposit(int money)  {
        this.money = this.money + money;
    }

    void withdraw(int money) {
        try {
            if(money > this.money)  throw new InsufficientBalanceException();
            this.money = this.money - money;
            System.out.println("Money has been withdrawed");
        }
        catch (InsufficientBalanceException e)  {
            System.out.println("Error: " + e);
            System.out.println("Money couldn't be withdrawed");
        }
    }
}

class InsufficientBalanceException extends Exception    {
    public String toString()    {
        return "Insufficient balance to withdraw money";
    }
}
