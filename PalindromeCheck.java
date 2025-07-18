import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is a palindrome: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;  
            num = num / 10;                    
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is Not a Palindrome.");
        }

        sc.close();
    }
}
