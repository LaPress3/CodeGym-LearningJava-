

/* 
1/5/23  Comparing strings by reference
*/

public class AA4_CompareString_reference {
    
        public static String string1 = "Amigo";
        public static String string2 = string1;
        public static String string3 = new String(string1);
    
        public static void main(String[] args) {
            String same = "The references to the strings are the same";
            String different = "The references to the strings are different";
            String answer1 = (string1==string2) ? same: different;
            String answer2 = (string1==string3) ? same: different;
            String answer3 = (string2==string3) ? same: different;
            System.out.println(answer1);
            System.out.println(answer2);
            System.out.println(answer3);
        }
    }
    
