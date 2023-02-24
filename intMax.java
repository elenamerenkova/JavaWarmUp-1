/*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

https://codingbat.com/java
 */
public class intMax {
    public static void main(String[] args) {
        intMax(12, 14, 33); // input your int values here

    }
    public static int intMax(int a, int b, int c) {
        if ( a > b && a > c) {
            System.out.println(a);
            return a;
        }
        if ( b > a && b > c) {
            System.out.println(b);
            return b;
        }
        if ( c > a && c > b) {
            System.out.println(c);
            return c;
        }
        else return 0;
    }
}
