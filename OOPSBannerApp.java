public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        CharacterPatternMap patternMap = new CharacterPatternMap();

        // Store pattern for each letter
        String[][] letters = new String[word.length()][];

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

    // Static Inner Class
    static class CharacterPatternMap {

        public String[] getPattern(char ch) {

            switch (ch) {

                case 'O':
                    return new String[]{
                            " ***** ",
                            "*     *",
                            "*     *",
                            "*     *",
                            " ***** "
                    };

                case 'P':
                    return new String[]{
                            " ***** ",
                            "*     *",
                            " ***** ",
                            "*      ",
                            "*      "
                    };

                case 'S':
                    return new String[]{
                            " ***** ",
                            "*      ",
                            " ***** ",
                            "      *",
                            " ***** "
                    };

                default:
                    return new String[]{
                            "       ",
                            "       ",
                            "       ",
                            "       ",
                            "       "
                    };
            }
        }
    }
}