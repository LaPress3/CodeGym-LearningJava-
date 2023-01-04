import java.util.Scanner;

/* 
1/3/23 
Find bigger number and use ternary operator instead of else if
*/

public class AA2_AbsVal_with_TernaryOp {
    public static void main(String[] args) {
        String Equal= ("The numbers are equal");
        String NotEqual = ("The numbers are not equal");
        Scanner scan= new Scanner (System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        String answer = (Math.abs(num1-num2)<.000001) ? Equal: NotEqual;
        System.out.println(answer);
       
    }
}

    
