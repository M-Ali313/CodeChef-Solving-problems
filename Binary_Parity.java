 
package codechef;
 
import java.util.Scanner;

public class Binary_Parity {
    public static void main(String args[]){
        
          Scanner scan=new Scanner(System.in);
	        int t=scan.nextInt();
	   while(t-->0){               // difficulty 771  
	        int a=scan.nextInt();
                int sum=0;
                String s=Integer.toBinaryString(a);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1')
                sum++;
            }
               System.out.println(sum%2==0? "EVEN":"ODD");
	   }
    }
}
