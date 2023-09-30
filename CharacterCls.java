import java.util.regex.*;

public class CharacterCls {
    public static void main(String args[]){
        // Pattern p = Pattern.compile(".xx.");
        // Matcher m = p.matcher("AxxB");
        // System.out.println("Check matching or not: " + m.matches());
        System.out.println(Pattern.matches("[xyz]","abcd")); // false
        System.out.println(Pattern.matches("[xyz]","x")); // true
        System.out.println(Pattern.matches("[xyz]","[xxxxyyyyyyyz]")); // false

    }
}
