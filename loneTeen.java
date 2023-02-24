/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false

https://codingbat.com/java
 */
public class loneTeen {
    public static void main(String[] args) {
        loneTeen(21, 19); // input your int values here
    }

    public static boolean loneTeen(int a, int b) {
        if ( a >= 13 && a <= 19 && b >= 13 && b <= 19) {
            System.out.println("false");
            return false;
        } else System.out.println("true"); return true;
    }
}
