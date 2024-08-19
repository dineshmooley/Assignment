import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index you want to access");
        int i = sc.nextInt();

        if (i >= n) throw new ArrayIndexOutOfBoundsException("Can't access the index out of the range of the array");
        System.out.println(arr[i]);
    }
}
