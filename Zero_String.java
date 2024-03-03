import java.util.Scanner;

public class Zero_String {

    public static void main(String ara[]) {
     
          Scanner scan=new Scanner(System.in);
	                int t=scan.nextInt();
	           while(t-->0){          //  difficalty   1042  
	               int n=scan.nextInt();
	               String s=scan.next();
	           char arr[]=s.toCharArray();
	               int c=0;
	               int p=0;
	          for(int i=0;i<n;i++){
	              if(arr[i]=='1')
	                 c++;
	              else
	              p++;
	          }
	          for(int i=0;i<n;i++){
	             
	          }
	          
	          if(c>p)
	                System.out.println(p+1);
	          else 
	                System.out.println(c);
	           }
    }
}
