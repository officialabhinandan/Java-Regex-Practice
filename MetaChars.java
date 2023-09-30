import java.util.regex.*;

public class MetaChars {
    public static void main(String args[]){
        System.out.println("Metacharacters d.....");  // d means digit
        System.out.println(Pattern.matches("d", "abc")); // false non-digit
        System.out.println(Pattern.matches("d", "1")); // true, digit and comes once
        System.out.println(Pattern.matches("d", "4443")); // false, digit but comes more than 1 time
        System.out.println(Pattern.matches("d", "323abc")); // false, digit and char
    
        System.out.println("Metacharacters D.....");  // d means non digit
        System.out.println(Pattern.matches("D", "abc")); // false, non-digit but comes more than once
        System.out.println(Pattern.matches("D", "1")); // false, digit
        System.out.println(Pattern.matches("D", "4443")); // false, digit 
        System.out.println(Pattern.matches("D", "323abc")); // false, digit and char
        System.out.println(Pattern.matches("D", "m")); // true, non digit and comes once 
        
        System.out.println("Metacharacters D with quantifiers.........");
        System.out.println(Pattern.matches("D*", "abc")); // true, non digit may come 0 or more times
    }
}
