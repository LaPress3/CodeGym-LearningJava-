import java.util.Scanner;

/* 
Conscription assignment...Scan user name and age then use if else
*/

public class Conscription {
    public static void main(String[] args) {
        String militaryCommissar = ", you've been drafted for military service";
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine(); //scan user name
        int age  = scan.nextInt();//scan user age
        if (age >= 18 && age <= 28 )
        System.out.println(name + militaryCommissar);
        
        }
}
