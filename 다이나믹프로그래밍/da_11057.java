import java.util.*;
public class da_11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        
        System.out.println(cal(num));

        public staitc int cal(int num){
           if(num==1){
               return 10;
           }
           else{
             cal(1)=2;
             cal(0)=1;

             cal(num)=cal(num-1)+cal(num-2);
           }    

        }
        sc.close();
    }
    
}
