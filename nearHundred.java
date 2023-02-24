/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

https://codingbat.com/java
 */
public class nearHundred {
    public static void main(String[] args) {
        nearHundred(90); // input your values here
    }
    public static boolean nearHundred(int n) {
        if ( 100 - n < 100 - 10 || 200 - n < 200 - 10) {
            System.out.println("true");
            return true;

        } else System.out.println("false"); return false;


    }
}
