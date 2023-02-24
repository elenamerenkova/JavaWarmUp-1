/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

https://codingbat.com/java
 */
public class monkeyTrouble {
    public static void main(String[] args) {
        monkeyTrouble(false, true); // change your params here

    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            System.out.println("We are in trouble");
            return true;
        } else System.out.println("We are good"); return false;

    }
}
