import java.util.*;

public class math_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int x;
        int y;

        if(arr[0] == arr[2]){
            x = arr[4];
        }else{
            x = (arr[0] == arr[4] ? arr[2] : arr[0]);
        }

        if(arr[1] == arr[3]){
            y = arr[5];
        }else{
            y = (arr[1] == arr[5] ? arr[3] : arr[1]);
        }
        
        System.out.print(x+" ");
        System.out.print(y);


        sc.close();
    }
}
