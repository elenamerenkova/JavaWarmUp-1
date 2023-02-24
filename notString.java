/*
Given a string, return a new string where "not " has been added to the front. However, if the string already begins
with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

https://codingbat.com/java
 */
public class notString {
    public static void main(String[] args) {
        notString("cat");
    }
    public static String notString(String str) {
        String not = "not";
        if (str.substring(0,3).equals(not)) {
            System.out.println(str);
            return str;
        } else System.out.println(not +" "+ str); return not+str;
    }
}
