import java.util.Scanner;

public class CountEVENNums {
    public static void main(String[] args) {
        System.out.print("Enter the last number to count even numbers from 1 to: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        System.out.print("Even numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println(); 
        System.out.println("Total even numbers from 1 to " + n + " is: " + count);
        sc.close();
    }
}
