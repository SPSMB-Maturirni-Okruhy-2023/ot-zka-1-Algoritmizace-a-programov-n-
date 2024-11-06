package cz.spsmb.maturity;

public class Utils {
    public static final String STAR = "*";

    static public String stars(int x) {
        if (x > 0) {
            String word = "";
            for (int i = 0; i < x; i++) {
                word += STAR;
            }
            System.out.println(word);
            return word;
        }
        return "";
    }
}
