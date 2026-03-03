public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O1 = getO();
        String[] O2 = getO();
        String[] P  = getP();
        String[] S  = getS();

        
        for (int i = 0; i < O1.length; i++) {
            System.out.println(O1[i] + "   " + O2[i] + "   " + P[i] + "   " + S[i]);
        }
    }

    
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for P
    public static String[] getP() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    // Static method for S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}