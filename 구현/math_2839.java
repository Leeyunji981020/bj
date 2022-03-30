import java.util.*;
public class math_2839 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int num = sc.nextInt();
       
        while(true){
            if(num % 5 ==0){
                count += num/5;
                System.out.println(count);
                break;
            }else{
                num = num-3;
                count++;
            }

            if(num <0){
                System.out.println(-1);
                break;
            }
        }
        
        
       
    

        sc.close();
    }
    
}
