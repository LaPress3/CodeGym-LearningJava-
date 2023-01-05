import java.util.Scanner;

/* 
1/1/2023
Using Logical operator or||
To work or not to work? That is the question.
*/

public class A8_usingOR{
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        scan.close();
        boolean tooYoung = (num1<20);
        boolean tooOld =(num1>60);
        if(tooYoung||tooOld)
        System.out.println("You don't have to work");
        else
        System.out.println("You have to work");
    }
}

