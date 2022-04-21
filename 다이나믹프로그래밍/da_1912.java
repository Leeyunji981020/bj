import java.util.*;
public class da_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        // 2중??
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[num];
        int max=arr[0];
        dp[0] = arr[0];
        
        for(int i=1; i<num; i++){
           
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);

             max = Math.max(dp[i],max);
        }

         System.out.println(max);

        sc.close();


    }
    
}
