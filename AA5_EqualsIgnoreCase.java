

/* 
1/9/23  Equals ignore Case for string input
*/
import java.util.Scanner;

/* 
Broken keyboard make equals non case sensitive
*/

public class AA5_EqualsIgnoreCase {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        String Granted = "Access granted";
        String Denied = "Access denied";
        Scanner scan = new Scanner (System.in);
        String input = scan.nextLine();
        scan.close();
        String answer = (secret.equalsIgnoreCase(input))? Granted : Denied;
        System.out.println(answer);
    }
}