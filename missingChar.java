/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"

https://codingbat.com/java
 */
public class missingChar {
    public static void main(String[] args) {
        missingChar("catzilla", 4); // input your string here
    }

    public static String missingChar(String str, int n) {

        String begin = "";
        String end = "";
        if ( str.length() > 0 && n <= str.length()-1) {
            begin = str.substring(0, n);
            end = str.substring(n+1);
            System.out.println(begin+end);

        } return begin+end;
    }

}
