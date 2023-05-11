import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Separate the vowels and consonants
        String vowels = "";
        String consonants = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                vowels += ch;
            } else if (isConsonant(ch)) {
                consonants += ch;
            }
        }

        // Write the vowels to VOWEL.TXT
        try {
            FileWriter writer = new FileWriter("VOWEL.TXT");
            writer.write(vowels);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write the consonants to CONSONANT.TXT
        try {
            FileWriter writer = new FileWriter("CONSONANT.TXT");
            writer.write(consonants);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Notify the user that the files have been created
        System.out.println("VOWEL.TXT and CONSONANT.TXT have been created.");
    }

    // Helper method to determine if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    // Helper method to determine if a character is a consonant
    public static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }
}
