import java.util.Scanner;

/* 
Warm or cold
*/

public class WarmOrColdIfElse {
    public static void main(String[] args) {
        String cold = "It's cold outside";
        String warm = "It's warm outside";
        //write your code here
        Scanner scan= new Scanner(System.in);
        int temp = scan.nextInt();
        if (temp<0)
        System.out.println(cold);
        else 
        System.out.println(warm);
    }
}