import java.util.Scanner;

/* 
1/3/23 
Find bigger number and use ternary operator instead of else if
*/

public class A10_FindMax_TernaryOp {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numberA = scan.nextInt();
            int numberB = scan.nextInt();
            int max = numberA > numberB ? numberA : numberB; /*Ternary operator here */
            System.out.println(max);
            
        }
    }
    
