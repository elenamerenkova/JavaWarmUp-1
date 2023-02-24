/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

https://codingbat.com/java
 */

public class in1020 {
    public static void main(String[] args) {
        in1020(12, 99); // input your int values here
    }

    public static boolean in1020(int a, int b) {
        if (a >= 10 && a <=20 || b >= 10 && b <= 20) {
            System.out.println("true");
            return true;
        } else System.out.println("false"); return false;
    }
}
