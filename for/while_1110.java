import java.util.*;
public class while_1110 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int count=0;
       int copy = a;
        while(true){
            a = ((a % 10)*10) + (((a/10)+(a %10))%10);
            count++;
            if(copy == a){
                break;
            }

            
        }
        System.out.println(count);
        scanner.close();
    }
}
