public class OOPSBannerApp {

    // Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create Character Pattern Maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        };

        String[] pPattern = {
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        };

        String[] sPattern = {
                " ***** ",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                " ***** "
        };

        String[] spacePattern = {
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };

        return new CharacterPatternMap[] {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    // Get Pattern
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', maps);
    }

    // Print Message
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        message = message.toUpperCase();

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), maps);
                System.out.print(pattern[row] + "   "); // space between letters
            }

            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";  // <-- Now clearly O O P S

        printMessage(message, charMaps);
    }
}