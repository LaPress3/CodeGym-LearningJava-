import java.util.Scanner;

/* 
12/28/2022
scaner for user to input body temp
Converting If Else statements into boolean format to determine if temp is  high, low .or normal
*/

public class A6_IfElsetoBoolean {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        /*write following if else using boolean
        if (bodyTemperature > 37) {
            System.out.println("Body temperature is high");
        } else if (bodyTemperature < 36) {
            System.out.println("Body temperature is low");
        } else {
            System.out.println("Body temperature is normal");
        }*/
         isHigh =(bodyTemperature>37);
         isLow = (bodyTemperature<36);
        if (isHigh)
        System.out.println("Body temperature is high");
        else if (isLow)
        System.out.println("Body temperature is low");
        else
        System.out.println("Body temperature is normal");
    }
}

