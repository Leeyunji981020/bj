import java.util.*;
public class gridy_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[][] arr = new int[A][A];
        for(int i=0; i<A; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[] answer = new int[A];
        int count=0;
        int sum = arr[0][1];

        for(int i=0; i<A-1; i++){
            for(int j=i+1; j<A-1; j++){
                if(arr[j][0]>=sum){
                    sum = arr[j][1];
                    count++;
                }
            }
            answer[i] = count;
            System.out.println(answer[i]);
        }
            int a=0;
            for(int i=0; i<A-1; i++){
                if(answer[i]<answer[i+1]){
                    a = answer[i+1];
                }   
            }
            //System.out.println(a);
        sc.close();
    }
}
