import java.util.*;
public class bro_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<n; i++){
            sum=i;
            String s = Integer.toString(i);
            
            for(int j=0; j<s.toCharArray().length; j++){
                sum+=s.charAt(j)-'0';
            }
            
            if(sum==n){
                System.out.println(i);
                break;
            }else if(i==n-1 && sum!=n){
                System.out.println(0);
            }
        }
       
      


        sc.close();
    }
}
