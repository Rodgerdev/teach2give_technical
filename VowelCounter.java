/*Write a program that counts the number of vowels in a sentence. */
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase to handle both uppercase and lowercase vowels
        
        int vowelCount = countVowels(sentence);
        
        System.out.println("Number of vowels in the sentence: " + vowelCount);
        
        scanner.close();
    }
    
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
