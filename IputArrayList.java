 
package arraylist;
 
import java.util.ArrayList;

class books{
    
    String name;
    int price;
    books(String s,int p){
     name=s;
     price=p;
    }
}
public class IputArrayList {
    public static void main(String sa[]){
        
        ArrayList <books> arr=new ArrayList();
        books b=new books("Phisic ",59990);
        books b1=new books("Java ",70000);
        
        arr.add(b);
        arr.add(b1);
        for(books f:arr)
            System.out.println(f.name+" "+ f.price);
        
    }
}
