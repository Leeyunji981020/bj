import java.util.*;
public class jagui_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum=1;
        for(int i=1; i<=a; i++){
            if(a==0){
                System.out.println(1);
                break;
            }
            sum = sum*i;
        }
        System.out.println(sum);



        sc.close();
    }
    
}
