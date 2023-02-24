/*
Given a string, return a string made of the first 2 chars (if present), however include first char only
if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"

https://codingbat.com/java
 */
public class startOz {
    public static void main(String[] args) {
        startOz("ozymandias"); // input your string here
    }

    public static String startOz(String str) {
        String oz = "oz";

        if (str.substring(0,2).equals(oz.substring(0,2))) {
            System.out.println(str.substring(0,2));
            return str.substring(0,2);
        }

        if (str.substring(0,1).equals(String.valueOf(oz.charAt(0)))) {
            System.out.println("o");
            return "o";
        }

        if (str.substring(1,2).equals(String.valueOf(oz.charAt(1)))) {
            System.out.println("z");
            return "z";
        }

        else return str;

    }
}
