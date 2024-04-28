//Write a program that takes an integer as input and returns an integer with reversed digit ordering.
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reversedNum = reverseInteger(num);
        System.out.println("Reversed integer: " + reversedNum);
    }
    
    public static int reverseInteger(int num) {
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num; // Make it positive for reversal
        }
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        //putting back the -ve sign if input was negative
        if (isNegative) {
            return -reversedNum;
        } else {
            return reversedNum;
        }
    }
}
