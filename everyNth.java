/*
Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"

https://codingbat.com/java
 */
public class everyNth {
    public static void main(String[] args) {
        everyNth("Miracle", 2);
    }

    public static String everyNth(String str, int n) {
        String made = "";
        if ( n >= 1) {
            for ( int i = 0; i < str.length(); i = i + n) {
                made = String.valueOf(str.charAt(i));
                System.out.println(made);
            }
            return  made;
        } else System.out.println("error");return made;

    }
}
