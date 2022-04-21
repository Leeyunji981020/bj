import java.util.*;
public class gridy_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum=K;
        int count=0;

       
            for(int i=N-1; i>=0; i--){
                if(arr[i]<=sum){
                    while(sum-arr[i]>=0){
                            sum -= arr[i];
                            count++;
                        
                    }
        } 
         else if(sum==0){
            System.out.println(count);
            break;
        } 
            }


        sc.close();
    }
    
}
