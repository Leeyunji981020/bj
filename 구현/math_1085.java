import java.util.*;
public class math_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myx = sc.nextInt();
        int myy = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int yy=0;
        int xx=0;

        if(x-myx > myx){
            xx = myx;
        }else{
            xx = x-myx;
        }

        if(y - myy > myy){
            yy = myy;
        }else{
            yy = y-myy;
        }

        System.out.println(Math.min(yy, xx));

sc.close();
    }
    
}
