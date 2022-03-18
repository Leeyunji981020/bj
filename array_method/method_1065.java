import java.util.*;
public class method_1065 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] check = new int[1001];

        for(int i=1; i<=num; i++){
            check[i] = Num(i);
        }
        int count=0;
        for(int i=1; i<=num; i++){
            if(check[i]==1){
                count++;
            }
        }
        System.out.println(count);



        scanner.close();
    }

public static int Num(int a){
    int anw = 1;
    if(a<100){
        return anw;
    }else{
       
           int n = a/100;
           int n1 = (a/10)%10;
           int n2 = a%10;

           int f = n1-n;
           int g = n2-n1;
           if(f==g){
               //한수니까
               return 1;
           }else{
               return 0;
           }

       
    }
    

}
    
}
