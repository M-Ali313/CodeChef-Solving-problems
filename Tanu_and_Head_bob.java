 
package CodeChef1;
 
import java.util.Scanner;

public class Tanu_and_Head_bob {
    public static void main(String args[]){
        
        Scanner scan= new Scanner(System.in);
	           int t=scan.nextInt();
	     while(t-->0){
	         int n=scan.nextInt();  // difficalty 1065  
	         String s=scan.next();
	         char ch[]=s.toCharArray();
	         int ic=0,nc=0,nn=0;
	   for(int i=0;i<n;i++){
	       if(ch[i]=='I')
	         ic++;
	       else if(ch[i]=='Y')
	       nc++;
	       else
	       nn++;
	   }
	   if(ic!=0)
	        System.out.println("INDIAN");
	   else if(nc!=0)
	        System.out.println("NOT INDIAN");
	   else
	        System.out.println("NOT SURE");
	     }
    }
}
