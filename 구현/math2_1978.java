import java.util.*;
public class math2_1978 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int[] arr = new int[num];
                
                for(int i=0; i<num; i++){
                    arr[i] = sc.nextInt();
                }
                
                int answer=0;
                
                for(int i=0; i<arr.length; i++){
                    int count=0;
                    for(int j=2; j<arr[i]; j++){
                        if(arr[i]%j == 0){
                            count++;
                          
                        }

                    }if(count==0 && arr[i] != 1){
                       
                        answer++;
                    }

                
                }

                System.out.println(answer);


        sc.close();


    }
    
}
