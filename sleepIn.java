/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true

https://codingbat.com/java
 */
public class sleepIn {
    public static void main(String[] args) {
        sleepIn(true, false); // change your params here

    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("We sleep in");
            return false;
        } else System.out.println("We are not sleeping in");return true;
    }
}
