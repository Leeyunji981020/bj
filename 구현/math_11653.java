import java.util.*;
public class math_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        for(int i=2; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
                num = num/i;
                i = 1;
            }
            int sum=0;
            for(int j=2; j<num; j++){
                if(num%j==0){
                   sum++;
                   break;
                }
            }
           
            
            if(sum==0 && num!=1 ){
                System.out.println(num);
                break;
            }
        }

sc.close();

    }
    
}
