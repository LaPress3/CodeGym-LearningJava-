

/* 
1/10/23  loop a string  with user input 10 times
*/

import java.util.Scanner;

/* 
Everyone wants to be loved
*/

public class AA7_LoopUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lover = scan.nextLine();
        String text = " loves me.";
        int n = 0;
    while (n<10)
    {
     System.out.println(lover+text);
     n++;
    }
    scan.close();
    }

    }