/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

https://codingbat.com/java
 */
public class frontBack {
    public static void main(String[] args) {
        frontBack("catzilla"); // change your string here

    }
    public static String frontBack(String str) {
        String firstCh = String.valueOf(str.charAt(0));
        String lastCh = str.substring(str.length()-1);
        String remain = str.substring(1, str.length()-1);
        System.out.println(lastCh + remain + firstCh);

        return firstCh+lastCh;
    }
}
