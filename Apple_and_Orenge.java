
import java.util.Scanner;

 
public class Apple_and_Orenge {
     
    public static int gcd (int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);            //  difficalty  1040  Apple and Orange 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		    int n = s.nextInt();
		    int m = s.nextInt();
		    int val = gcd(n,m);
		    System.out.println(val);
		    
		    t--;
		}
	}
}

