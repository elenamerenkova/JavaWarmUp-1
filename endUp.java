/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"

https://codingbat.com/java
 */
public class endUp {
    public static void main(String[] args) {
        endUp("catzilla"); // input your string here

    }
    public static String endUp(String str) {
        String last = "";
        if ( str.length() > 3) {
            last = str.substring(str.length()-3);
            System.out.println(str.substring(0, str.length() - 3) + last.toUpperCase());
        } else System.out.println(str.toUpperCase()); return str;

    }
}
