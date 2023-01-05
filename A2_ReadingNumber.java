import java.util.Scanner;

/* created 12/27/2022
Reading numbers  (Finding mean and scanning input)
*/

public class A2_ReadingNumber {

    public static void main(String[] args) {
        //write your code here
Scanner scan = new Scanner (System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = ((a+b+c)/3);
scan.close();
System.out.println(d);
    }
}
