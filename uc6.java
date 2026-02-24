public class OOPSBannerUC6 {

    // Helper method for letter O
    static String[] getOPattern() {
        return new String[]{
            " ******** ",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            " ******** "
        };
    }

    // Helper method for letter P
    static String[] getPPattern() {
        return new String[]{
            " ******  ",
            "*      * ",
            "*      * ",
            " ******  ",
            "*        ",
            "*        ",
            "*        "
        };
    }

    // Helper method for letter S
    static String[] getSPattern() {
        return new String[]{
            " ******  ",
            "*      * ",
            "*        ",
            " ******  ",
            "       * ",
            "*      * ",
            " ******  "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build banner using method results
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}