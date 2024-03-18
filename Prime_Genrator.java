package CodeChef1;

import java.util.Scanner;

public class Prime_Genrator {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt(); //  difficulty  1069     *********
            int b = scan.nextInt();
            for (int i = a; i <= b; i++) {
                if (isprime(i)) {
                    System.out.println(i);
                }
            }
        System.out.println("");
        }
    }
    static boolean isprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
