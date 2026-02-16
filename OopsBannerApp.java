import java.util.HashMap;
import java.util.Map;

class LetterPattern {
    private String[] pattern;

    public LetterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OopsBannerApp {

    // Create and store patterns in Map
    public static Map<Character, LetterPattern> createPatterns() {
        Map<Character, LetterPattern> map = new HashMap<>();

        map.put('O', new LetterPattern(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        map.put('P', new LetterPattern(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        map.put('S', new LetterPattern(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        return map;
    }

    // Function to print banner text
    public static void printBanner(String text, Map<Character, LetterPattern> patterns) {

        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char ch : text.toCharArray()) {
                LetterPattern lp = patterns.get(ch);
                if (lp != null) {
                    System.out.print(lp.getPattern()[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, LetterPattern> patterns = createPatterns();

        printBanner("OOPS", patterns);
    }
}
