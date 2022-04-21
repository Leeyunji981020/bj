import java.util.*;
public class bro_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int min = 666;
        int count=0;
        String str="";
        while(num!=count){
            str = Integer.toString(min);
            if(str.contains("666")){
                count++;
            }
            min++;
        }

System.out.println(Integer.parseInt(str));



        sc.close();
    }
    
}
