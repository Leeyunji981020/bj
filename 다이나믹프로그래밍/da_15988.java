import java.util.*;
public class da_15988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a;
        //int b=0;
        int namuzi;
        int count=0;
        for(int i=0; i<num; i++){
            a = sc.nextInt();
            namuzi = a;
            for(int j=1; j<4; j++){
                namuzi-=j;
               count++;
                if(namuzi!=j){
                    //count+=a-j;
                    
                }
                namuzi = a;
            }
            
            System.out.println(count);

        }


        sc.close();
    }
}
