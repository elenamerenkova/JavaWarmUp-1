/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

https://codingbat.com/java
 */
public class close10 {
    public static void main(String[] args) {
        close10(13, 7); // insert your int values here

    }
    public static int close10(int a, int b) {
        int da = Math.abs(10-a);
        int db = Math.abs(10-b);
        if (da < db) {
            System.out.println(a);
            return a;
        }
        if (da == db) {
            System.out.println("0");
            return 0;
        }else System.out.println(b); return b;

    }
}
