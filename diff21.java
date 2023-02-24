/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

https://codingbat.com/java
 */
public class diff21 {
    public static void main(String[] args) {
        diff21(24); // change tour values here
    }
    public static int diff21(int n) {
        int x = Math.abs(21-n);
        if ( n <= 21 ) {

            System.out.println(x);
            return x;
        } else System.out.println(x*2); return x*2;
    }
}
