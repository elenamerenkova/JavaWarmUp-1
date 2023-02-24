/*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

https://codingbat.com/java
 */

public class startHi {
    public static void main(String[] args) {
        startHi("hi there"); // input your string value here
    }

    public static boolean startHi(String str) {
        String hi = "hi";
        int x = 2;
        if (str.substring(0, 2).equals(hi)) {
            System.out.println("true");
            return true;
        } else System.out.println("false");return false;
    }

}
