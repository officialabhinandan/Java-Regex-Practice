import java.util.regex.*;
public class Quantifiers {
    public static void main(String args[]){
        System.out.println(".... ? Quantifiers ....");
        System.out.println(Pattern.matches("[xyz]?", "x")); //true, comes 1 time
        System.out.println(Pattern.matches("[xyz]?", "xxx")); // false, comes more than 1 times
        System.out.println(Pattern.matches("[xyz]?", "xyyyyzz"));  // false, y comes more than 1 times
        System.out.println(Pattern.matches("[xyz]?", "xnchsx"));  // false, x comes more than one times
        System.out.println(Pattern.matches("[xyz]?", "[xy]")); // false x or y or z must occur one time
        
        System.out.println(".... + Quantifiers ....");
        System.out.println(Pattern.matches("[xyz]+", "x")); // true, x,y,z comes one or more time
        System.out.println(Pattern.matches("[xyz]+", "xxx")); // true, comes more than 1 times
        System.out.println(Pattern.matches("[xyz]+", "xyyyyzz"));  // false, y comes more than 1 times
        System.out.println(Pattern.matches("[xyz]+", "xnchsx"));  // false, x comes more than one times
        System.out.println(Pattern.matches("[xyz]+", "[xy]")); // false x or y or z must occur one time
        
        System.out.println(".... * Quantifiers ....");
        System.out.println(Pattern.matches("[xyz]*", "xyyyzx")); // true, x comes more than 1 time.
    }
}
