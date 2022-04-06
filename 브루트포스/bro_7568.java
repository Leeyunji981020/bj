import java.util.*;
public class bro_7568 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] weight = new int[num];
        int[] height = new int[num];

        for(int i=0; i<num; i++){
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        for(int i=0; i<num; i++){
            int score = 1;
            for(int j=0; j<num; j++){
                if(i==j){
                    continue;
                }if(weight[i]<weight[j] && height[i]<height[j]){
                    score++;
                }
            }
            System.out.print(score+" ");
        }
        sc.close();
    }
}
