/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del"
has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

https://codingbat.com/java
 */
public class delDel {
    public static void main(String[] args) {
        delDel("adelbc"); // change your string here
    }

    public static String delDel(String str) {

        if (str.substring(1,4).equals("del")) {
            System.out.println(str.substring(0,1) + str.substring(4));
            return str.substring(0,1) + str.substring(4);
        }
        else System.out.println(str);return str;
    }
}
