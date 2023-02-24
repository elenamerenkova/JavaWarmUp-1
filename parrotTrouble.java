/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
https://codingbat.com/java
 */
public class parrotTrouble {
    public static void main(String[] args) {
        parrotTrouble(true, 16); // change your values here
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && ((hour >= 0 && hour <=7) || (hour >= 20 && hour <= 24))) {
            System.out.println("We are in trouble");
            return true;
        } else System.out.println("We are fine"); return false;
    }
}
