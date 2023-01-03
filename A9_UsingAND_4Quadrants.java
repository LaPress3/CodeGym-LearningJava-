import java.util.Scanner;

/* 
1/2/23 using boolean and logioperator && to determine coordiantes
Quadrants
*/

public class A9_UsingAND_4Quadrants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X_axis = scan.nextInt();
        int y_axis = scan.nextInt();
        boolean quadrant1 = (X_axis > 0 && y_axis > 0);
        boolean quadrant2 = ( X_axis < 0 && y_axis > 0);
        boolean quadrant3 = ( X_axis < 0 && y_axis < 0);
        boolean quadrant4 = (X_axis > 0 && y_axis < 0);
    if (quadrant1)
    System.out.println(1);
    else if (quadrant2)
    System.out.println(2);
    else if (quadrant3)
    System.out.println(3);
    else if (quadrant4)
    System.out.println(4);
    }
}
