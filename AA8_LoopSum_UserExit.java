

/* 
1/10/23  loop adding two numbers or type ENTER to leave
*/

import java.util.Scanner;


public class AA8_LoopSum_UserExit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type Two numbers to get their sum  or type ENTER to leave program");
       
        boolean isExit = false;
        while (!isExit) {
            if (scan.hasNextInt()) {
                int number1 = scan.nextInt();
                int number2 = scan.nextInt();
                int sum = number1 + number2;
                System.out.println(sum);
            } else if (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        scan.close(); 
    }
}