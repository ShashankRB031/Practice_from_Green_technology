import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        int original = num;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Number of digits in " + original + " is: " + count);
    }
}
