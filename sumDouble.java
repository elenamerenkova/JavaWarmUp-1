/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

https://codingbat.com/java
 */
public class sumDouble {
    public static void main(String[] args) {
        sumDouble(2,3); // change your values here

    }
    public static int sumDouble(int a, int b) {
        if ( a == b ) {
            System.out.println((a+b) * 2);
            return (a+b) * 2;
        } else System.out.println(a+b); return a+b;
    }
}
