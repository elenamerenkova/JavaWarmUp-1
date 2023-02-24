/*
Given a string, take the first 2 chars and return the string with the 2 chars added at
both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2,
use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"

https://codingbat.com/java
 */
public class front22 {
    public static void main(String[] args) {
        front22("Ha"); // change your string here
    }
    public static String front22(String str) {
        String frontCh = str.substring(0, 2);
        System.out.println(frontCh+str+frontCh);
        return frontCh+str+frontCh;
    }
}
