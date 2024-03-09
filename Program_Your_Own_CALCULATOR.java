package codechef;

import java.util.Scanner;

public class Program_Your_Own_CALCULATOR {

    public static void main(String arr[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int c = 0;
            int x = scan.nextInt();
            int h = scan.nextInt();
            x = x / 2;
                           // difficalty   1031  Slow Start  
            while (h > 0) {
                if (c <5) {
                    h -= x;
                    c++;
                    continue;
                } else {
                    h -= x * 2;
                    c++;
                }
            }
            System.out.println(c);
        }

//         ----------------------------------------------------------
//                    double a=scan.nextDouble();
//	            double b=scan.nextDouble();
//	            char ch=scan.next().charAt(0);
//	    switch(ch){
//                case '+':System.out.println(a+b);
//                    break;
//                case '-':System.out.println(a-b);
//                    break;                // diffcalty  1028   
//                case '/':System.out.println(a/b);
//                    break;
//                case '*':System.out.println(a*b);
//                    break;
//	          
//	     }
    }
}
