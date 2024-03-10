package codechef;

import java.util.Scanner;

public class Encoding_Message { //     difficalty 1027     Encoding_Message

    public static void main(String ser[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s = scan.next();
            char[] arr = s.toCharArray();
            for (int j = 0; j < n - 1; j += 2) {

                char temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }                        

            for (int j = 0; j < n; j++) {
                arr[j] = (char) (25 - (int) (arr[j]) + 2 * 97);
            }

            String str = new String(arr);
            System.out.println(str);
        }
    }
}
