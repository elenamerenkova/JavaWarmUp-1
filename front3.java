/*
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

https://codingbat.com/java
 */
public class front3 {
    public static void main(String[] args) {
        front3("Machine"); // insert your input here
    }
    public static String front3(String str) {
        if (str.length() > 3) {
            String front = str.substring(0, 3);
            for (int i = 0; i <3; i++) {
                System.out.print(front);

            }return front;

        } else for (int i = 0; i <3; i++) {
            System.out.print(str);
        }
        return str;

    }
}
