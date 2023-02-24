/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

https://codingbat.com/java
 */
public class mixStart {
    public static void main(String[] args) {
        mixStart("mix snacks"); // enter your string here
    }

    public static boolean mixStart(String str) {
        String mix = "mix";
        if (mix.substring(1,3).equals(str.substring(1,3))) {
            System.out.println("true");
            return true;
        } else System.out.println("false");return false;
        }
    }

