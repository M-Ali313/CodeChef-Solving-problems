package codechef;

import java.util.Scanner;

public class The_Man_Code {

    public static void main(String arw[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
 
            if (a>b&&a>c&&a>=50) {
                System.out.println("A");
            } else if (b>a&&b>c&&b>=50) {
                System.out.println("B");
            } else if (c>b&&c>a&&c>=50) {
                System.out.println("C");
            }
            else {
                System.out.println("NOTA");
            }

        }

//        int t = scan.nextInt();
//        while (t-- > 0) {
//            int a = scan.nextInt();
//                                //   difficalty 1032            The Man Code
//            System.out.println((a + 1) / 2 + " " + (a + 2) / 3);
//        }
    }
}
