/*
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true

https://codingbat.com/java
 */
public class lastDigit {
    public static void main(String[] args) {
        lastDigit(56, 1999); // input your values here
    }
    public static boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            System.out.println("true");
            return true;
        } else System.out.println("false"); return false;
    }
}
