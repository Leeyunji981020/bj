import java.util.*;
public class String_11720 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // 숫자의 합 인데 공백 없이 주어짐
        // int num = scanner.nextInt();
        String number;
        int sum=0;

        number = scanner.next();
       

        for(char c : number.toCharArray()){
           
                sum += c -'0';  
        }

        System.out.println(sum);
        scanner.close();
    }
    
}
