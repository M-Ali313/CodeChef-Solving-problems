
import java.util.Arrays;
import java.util.Scanner;

 
public class Even_tual_Reduction {
      public static void main(String ara[]){
       Scanner scan=new Scanner(System.in);
        	 int t = scan.nextInt();
		  while(t-->0){
		      int n = scan.nextInt();
		      String s = scan.next();
		      char ch[] = s.toCharArray();
		      Arrays.sort(ch);
		      String str="";
		      String str1 = "";
		      for(int i = 0; i<ch.length; i++){
		          if(i%2==0)
		           str+= ch[i];
		            else
		            str1+= ch[i];
		      }
		      if(str.equals(str1))
		       System.out.println("YES");
		        else 
		         System.out.println("NO");
		  }
      }
}
