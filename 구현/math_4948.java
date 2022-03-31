import java.util.*;
public class math_4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = 2*a;
            if(a==0){
                break;
            }else{
        int count=0;
        for(int i=a+1; i<=b; i++){
            int k = 0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    k=1;
                    break;
                }
            }
            if(k==0 && i!=1){
                count++;
            }
        }
        System.out.println(count);

    }

}
        sc.close();

        
    }
}
