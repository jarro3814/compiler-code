import java.util.*;

public class JavaKeywordDetector {
    // Java ke reserved keywords ka Set
    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if",
            "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"
    ));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User se input lein
        System.out.println("Enter your Java code or text:");
        String input = scanner.nextLine();

        // Split input into words (using space, punctuation, or special characters)
        String[] words = input.split("\\s+|\\p{Punct}");

        boolean found = false;
        System.out.println("\nDetected Java Keywords:");
        for (String word : words) {
            if (JAVA_KEYWORDS.contains(word)) {
                System.out.println(word);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Java keywords found.");
        }

        scanner.close();
    }
}
