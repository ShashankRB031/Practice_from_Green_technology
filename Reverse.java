import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        System.out.println("Enter the number to reverse : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int answer = 0;
        while(number > 0){
            int lastDigit = number % 10;
            answer = answer * 10 + lastDigit;
            number = number / 10;

        }
        System.out.println(answer);
    }
}
