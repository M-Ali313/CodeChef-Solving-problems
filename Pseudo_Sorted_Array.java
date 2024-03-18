package CodeChef1;

import java.util.Scanner;

public class Pseudo_Sorted_Array {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();//   difficulty  1067  ****
            }
            int c = 0;
            int temp = 0;
            for (int i = 0; i < n - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    break;
                }
            }
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    c++;
                }
            }
            System.out.println((c==0)?"YES":"NO");

        }
    }
}
