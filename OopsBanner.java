import java.util.HashMap;

public class OopsBanner {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        String[] oPattern = {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };

        String[] pPattern = {
            "**** ",
            "** **",
            "** **",
            "**** ",
            "**   ",
            "**   ",
            "**   "
        };

        String[] sPattern = {
            " ****",
            "**   ",
            "**   ",
            " *** ",
            "   **",
            "   **",
            "**** "
        };

        String[] spacePattern = {
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        };

        charMap.put('O', oPattern);
        charMap.put('P', pPattern);
        charMap.put('S', sPattern);
        charMap.put(' ', spacePattern);

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = 7;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        displayBanner("OOPS", charMap);

    }
}