/* Task Name: Reading and converting strings*/
import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {
        //write your code here
Scanner scan = new Scanner (System.in);
String line1 = scan.nextLine();
String line2 = scan.nextLine();
String line3 = scan.nextLine();
System.out.println(line3);
System.out.println(line2.toUpperCase());
System.out.println(line1.toLowerCase());
}
}