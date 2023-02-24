/*
Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true

https://codingbat.com/java
 */
public class makes10 {
    public static void main(String[] args) {
        makes10(7, 10); // change your values here
    }
    public static boolean makes10(int a, int b) {
        if ( a == 10 || b == 10 || a+b == 10) {
            System.out.println("true");
            return true;
        } else System.out.println("false");return false;
    }
}
