
import java.util.Scanner;

 
public class Chef_and_his_Students {
    public static void main(String ara[]){
        
        Scanner scan=new Scanner(System.in);
	            int t=scan.nextInt();
	       while(t-->0){
	          String s=scan.next();
	          char ch[]=s.toCharArray();
	           int size=ch.length;
	           int c=0;
	       for(int i=0;i<size-1;i++){
	           if(ch[i]=='<'&&ch[i+1]=='>')
	                c++;
	       }
	           System.out.println(c);
	       }
    }
}
