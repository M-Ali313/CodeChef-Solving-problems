package CodeChef1;

import java.util.Scanner;

public class String_Protocol {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            char ch[] = s.toCharArray();
            int c = 0;
            int i = 0;
            for (i = 0; i < n - 1; i++) {
                if (ch[i] == ch[i + 1]) {     // difficulty  1065  
                    i++;
                }
                c++;
            }
            if (i < n) {
                c++;
            }
            System.out.println(c);
        }

    }
}
