package CountLetters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountLetters1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        try {
            validateInput(word);
            validateWordLength(word);
            displayLetterOccurrences(word);
        } catch (InvalidInputException1 | WordLengthException1 e) {
            System.out.println(e.getMessage());
        }
    }
    private static void validateInput(String word) throws InvalidInputException1 {
        if (!word.matches("[a-zA-Z]+")) {
            throw new InvalidInputException1("Invalid input! Please enter a word with only letters (no spaces or punctuation).");
        }
    }
    private static void validateWordLength(String word) throws WordLengthException1 {
        if (word.isEmpty() || word.length() > 45) {
            throw new WordLengthException1("Word length should not be empty, null, or exceed 45 characters.");
        }
    }
    private static void displayLetterOccurrences(String word) {
        Map<Character, Integer> occurrences = new HashMap<>();
        for (char c : word.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }

        System.out.println("Letter occurrences:");
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
