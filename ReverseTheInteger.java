import java.util.Scanner;

public class ReverseTheInteger {
    public static void main(String[] args) {
        System.out.print("Enter the number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("The reversed number is: " + reversed);
        sc.close();
    }
}
