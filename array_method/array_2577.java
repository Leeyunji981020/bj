import java.util.*;
public class array_2577 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[10];
        int namuezi[] = new int[10];
        int result=0;
        // 조금 복잡하게 품 
        for(int i=0; i<10; i++){
            number[i] = scanner.nextInt();
            namuezi[i] = number[i]%42;

        }

        for(int i=0; i<10; i++){
            for(int k=i+1; k<10; k++){
                if(namuezi[i]==namuezi[k]){

                    namuezi[k]=-1;
                }
            }
        }
        for(int i=0; i<10; i++){
            if(namuezi[i]!=-1){
                result++;
            }
        }

System.out.println(result);



        scanner.close();
    }
    
}
