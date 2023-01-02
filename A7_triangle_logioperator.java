import java.util.Scanner;

/* 
1/1/2023
compare three int to determine if its a triangle...
If each comparison indicates that the side is less than the sum of the other two sides, then a triangle with these sides does exist.
If even one comparison indicates that the side is greater than or equal to the sum of the other two sides, then a triangle with these sides does not exist.
*/


/* 
Activity: Triangle 
Logical Operators
*/

public class A7_triangle_logioperator {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();
int num2 = scan.nextInt();
int num3 = scan.nextInt();
boolean test1 = (num1< (num2+num3));
boolean test2 = (num2 < (num1 + num3));
boolean test3 = (num3<(num1+num2));
if (test1&&test2&&test3)
System.out.println(TRIANGLE_EXISTS);
else
System.out.println(TRIANGLE_DOES_NOT_EXIST);
}
}
