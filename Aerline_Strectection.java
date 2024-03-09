
import java.util.Arrays;
import java.util.*;
 
import java.util.Scanner;

 
public class Aerline_Strectection {
    public static void main(String ar[]){
        
          Scanner scan=new Scanner(System.in);
	            int t=scan.nextInt();
	       while(t-->0){
                 int a=scan.nextInt();
                 int b=scan.nextInt();
                 int c=scan.nextInt();
                 
                 int d=scan.nextInt();
                 int e=scan.nextInt();
                 
            if((a+b)<=d&&c<=e)     //   difficalty   1042  
                       System.out.println("YES");
            else if((a+c)<=d&&b<=e)
                       System.out.println("YES");
            else if((b+c)<=d&&a<=e)
                       System.out.println("YES");
            else 
                       System.out.println("NO");
                 
               }
//	         int a=scan.nextInt();
//                 int b=scan.nextInt();
//                 int c=scan.nextInt();
//                 int d=scan.nextInt();
//                  
//                 Set<Integer> st=new HashSet<>();
//                 for(int i=a;i<b;i++)
//                     st.add(i);
//                 
//                     for(int i=c;i<d;i++)
//                     st.add(i);
//                   System.out.println(st.size());
//	         
	      
    
    }
}
