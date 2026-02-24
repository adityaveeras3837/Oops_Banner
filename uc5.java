public class UC5 {
    public static void main(String[] args) {

        // Inline array declaration and initialization
        String[] banner = {
            String.join(" ",
                " ******** ", " ********  ", " ******  ", " ******** "
            ),
            String.join(" ",
                "*        *", "*        *", "*      * ", "*         "
            ),
            String.join(" ",
                "*        *", "*        *", "*      * ", "*         "
            ),
            String.join(" ",
                "*        *", "*        *", " ******  ", " ******** "
            ),
            String.join(" ",
                "*        *", "*        *", "*        ", "         *"
            ),
            String.join(" ",
                "*        *", "*        *", "*        ", "         *"
            ),
            String.join(" ",
                " ******** ", " ******** ", "*        ", " ******** "
            )
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}