package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

    public static void main(String[] args) {
        // Example 1: Matching a pattern in a string
        String text = "The quick brown fox jumps over the lazy dog.";
        String pattern1 = "fox";

        System.out.println("Example 1:");
        Pattern pattern = Pattern.compile(pattern1);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Pattern found: " + matcher.group());
        } else {
            System.out.println("Pattern not found.");
        }

        // Example 2: Matching multiple occurrences
        String pattern2 = "\\b\\w+\\b"; // Matches words

        System.out.println("\nExample 2:");
        pattern = Pattern.compile(pattern2);
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Word found: " + matcher.group());
        }

        // Example 3: Replacing using regular expression
        String input = "The price is $10.99 and the discount is 20%.";
        String regex = "\\$\\d+\\.\\d+"; // Matches currency format $xx.xx

        System.out.println("\nExample 3:");
        String replacedText = input.replaceAll(regex, "[price]");
        System.out.println("Original text: " + input);
        System.out.println("Modified text: " + replacedText);

        // Example 4: Splitting using regular expression
        String sentence = "Java is a powerful programming language.";
        String[] words = sentence.split("\\s+");

        System.out.println("\nExample 4:");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

