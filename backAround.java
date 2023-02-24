/*
Given a string, take the last char and return a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"

https://codingbat.com/java
 */

public class backAround {
    public static void main(String[] args) {
        backAround("cat"); // input your string value here

    }
    public static String backAround(String str) {
        String lastCh = String.valueOf(str.charAt(str.length()-1));
        System.out.println(lastCh+str+lastCh);
        return lastCh+str+lastCh;
    }
}
