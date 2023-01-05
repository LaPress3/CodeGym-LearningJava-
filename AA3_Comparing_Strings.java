import java.util.Scanner;

/* 
1/3/23 
Find bigger number and use ternary operator instead of else if
*/

public class AA3_Comparing_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S1 = scan.nextLine();
        String S2 = scan.nextLine();
        scan.close();
        if (S1.equals(S2))
        System.out.println("The strings are the same");
        else
                System.out.println("The strings are different");
            }
        }

    
