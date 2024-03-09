package codechef;

import java.util.Scanner;

public class Reach_Codetown {

    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
	            int t=scan.nextInt();
	       while(t-->0){
	           int a=scan.nextInt();
	           int b=scan.nextInt();
	       if(a%b==0||(a%2==0&&b%2!=0)||(a<b)&&(b-a)%2==0)
	            System.out.println("Limak");
	       else
	            System.out.println("Bob");
	            
	       }
        
        
        
//        -----------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- > 0) {
//            String a = sc.nextLine();
//            char arr[] = a.toCharArray();
//            boolean isVowel[] = {false, true, false, true, false, true, false, false};
//
//            boolean isValid = true;
//                                              // difficalty 1022    Reach_Codetown  
//            for (int i = 0; i < 8; i++) {
//                if ("AEIOU".contains(arr[i] + "") != isVowel[i]) {
//                    isValid = false;
//                    break;
//                }
//            }
//
//            System.out.println((isValid ? "YES" : "NO"));
//
//        }
    }
}
