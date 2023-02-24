/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

https://codingbat.com/java
 */
public class max1020 {
    public static void main(String[] args) {
        max1020(5, 8); // insert your int values here
    }

    public static int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            if ( a > b ) {
                System.out.println(a);
                return a;
            } else System.out.println(b);return b;
        } else System.out.println("0");return 0;
    }
}
