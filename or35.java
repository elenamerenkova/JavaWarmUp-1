/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false

https://codingbat.com/java
 */
public class or35 {
    public static void main(String[] args) {
        or35(-10); // enter your values here
    }
    public static boolean or35(int n) {
        if ( n > 0 ) {
            if ( n % 3 == 0 || n % 5 == 0) {
                System.out.println("true");
                return true;
            } else System.out.println("false");return false;
        } else System.out.println("Number must be non-negative");return false;
    }
}
