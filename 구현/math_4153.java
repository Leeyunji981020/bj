
import java.util.*;
public class math_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while(true){
            int[] arr = new int[3];
                arr[0]= sc.nextInt();
                arr[1] = sc.nextInt();
                arr[2] = sc.nextInt();
            if(arr[0]==0){
                break;
            }else{
               Arrays.sort(arr);
               int a = arr[0]*arr[0];
               int b = arr[1]*arr[1];
               int c = arr[2]*arr[2];
               if((a+b)==c){
                   System.out.println("right");
               }else{
                   System.out.println("wrong");
               }
            }
        }
    
        
    
    
    sc.close();
    }
}
