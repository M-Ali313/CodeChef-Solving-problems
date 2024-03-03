
import java.util.Scanner;

 
public class Room_Allocation {
    public static void main(String ara[]){
       Scanner scan=new Scanner(System.in);
	              int t=scan.nextInt();
	        while(t-->0){
	            int n=scan.nextInt();
	            float arr[]=new float[n];
	            int c=0;
	       for(int i=0;i<n;i++){
	           arr[i]=scan.nextFloat();
	           c+=(int)Math.ceil(arr[i]/2);    //  difficalty  729  new  
	         
	       }
	            System.out.println(c);
	        }   
        
    }
}
