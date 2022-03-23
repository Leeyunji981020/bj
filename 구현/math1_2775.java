import java.util.*;
public class math1_2775 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=0; i<a; i++){
            int floor = sc.nextInt();
            int hosu = sc.nextInt();
            int[][] arr =new int[15][15];

            for(int k=0; k<15; k++){
                arr[0][k]=k;
                arr[k][1]=1;
            }

            for(int j=1; j<15; j++){
                for(int k=2; k<15; k++){
                    arr[j][k] = arr[j-1][k] + arr[j][k-1];
                }
            }
            System.out.println(arr[floor][hosu]);

        }

        sc.close();
    }
}
