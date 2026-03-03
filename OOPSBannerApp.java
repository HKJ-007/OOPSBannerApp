import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        CharacterPatternMap patternMap = new CharacterPatternMap();

        String[][] letters = new String[word.length()][];

        // Retrieve patterns using Map
        for (int i = 0; i < word.length(); i++) {
            letters[i] = patternMap.getPattern(word.charAt(i));
        }

        // Print banner row by row
        for (int row = 0; row < letters[0].length; row++) {
            for (int col = 0; col < letters.length; col++) {
                System.out.print(letters[col][row] + "   ");
            }
            System.out.println();
        }
    }

    // Static Inner Class with Map
    static class CharacterPatternMap {

        private Map<Character, String[]> patternMap;

        public CharacterPatternMap() {

            patternMap = new HashMap<>();

            patternMap.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            patternMap.put('P', new String[]{
                    " ***** ",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      "
            });

            patternMap.put('S', new String[]{
                    " ***** ",
                    "*      ",
                    " ***** ",
                    "      *",
                    " ***** "
            });
        }

        public String[] getPattern(char ch) {
            return patternMap.getOrDefault(ch, new String[]{
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       "
            });
        }
    }
}