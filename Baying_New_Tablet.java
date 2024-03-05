import java.util.Scanner;

public class Baying_New_Tablet {

    public static void main(String aar[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int b = scan.nextInt();
            boolean f = false;
            int max = 0;
            while (n-- > 0) {

                int w = scan.nextInt();
                int h = scan.nextInt();
                int p = scan.nextInt(); //  difficalty  1037   Baying new Tablet 
                int area=w*h;
            if (p <= b&&max<area ) {
                  max=area;
                    f = true;
                }

            }
            if (f) {
                System.out.println(max);
            } else {
                System.out.println("no tablet");
            }

        }
    }
}
