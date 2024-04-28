// Write a program that takes an integer as input and returns true if the input is a power of two.
import java.util.Scanner;

public class PowerOfTwoChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        boolean isPowerOfTwo = checkPowerOfTwo(number);
        
        if (isPowerOfTwo) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
    }

    public static boolean checkPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }
        
        // A number is a power of two if it has only one bit set to 1
        // So, we can use bitwise AND to check if it's a power of two
        return (number & (number - 1)) == 0;
    }
}
