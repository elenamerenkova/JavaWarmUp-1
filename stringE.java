/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false

https://codingbat.com/java
 */
public class stringE {
    public static void main(String[] args) {
        stringE("Memememe"); // input your string here
    }
    public static boolean stringE(String str) {
        int e = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("e")) {
                e++;
            }
        }
        if ( e <= 3) {
            System.out.println("true");
            return true;
        } else System.out.println("false");return false;


    }

    }

