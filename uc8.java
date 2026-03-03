import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        charMap.put('O', new String[]{
                " ***  ",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                " ***  "
        });

        // Pattern for P
        charMap.put('P', new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        });

        // Pattern for S
        charMap.put('S', new String[]{
                " **** ",
                "**    ",
                "**    ",
                " ***  ",
                "    **",
                "    **",
                "****  "
        });

        // Space pattern
        charMap.put(' ', new String[]{
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      "
        });

        return charMap;
    }

    /**
     * Displays banner using HashMap
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append("  "); // space between letters
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}