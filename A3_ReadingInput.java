/* Created: 12/27/2022
Task Name: Reading and converting strings*/
import java.util.Scanner;

public class A3_ReadingInput {

    public static void main(String[] args) {
        
Scanner scan = new Scanner (System.in);
String line1 = scan.nextLine();
String line2 = scan.nextLine();
String line3 = scan.nextLine();
scan.close();
System.out.println(line3);
System.out.println(line2.toUpperCase());
System.out.println(line1.toLowerCase());
}
}
