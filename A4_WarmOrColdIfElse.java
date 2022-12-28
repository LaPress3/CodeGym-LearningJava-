import java.util.Scanner;

/* Created 12/28/2022
Warm or cold Basic if Else practice
*/

public class A4_WarmOrColdIfElse {
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
