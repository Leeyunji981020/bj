import java.util.*;
public class jagui_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum=0;
        int f = 1;

        for(int i=1; i<a; i++){
            
            int temp = f;
            f = temp+sum;
            sum = temp;

        }
        if(a==0){
            System.out.println(0);
           
        }else{

            System.out.println(f);
        }
    }
}
