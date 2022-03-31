import java.util.*;
public class math_9020 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a,b;
       b = sc.nextInt();
    
        for(int i=0; i<b; i++){
            a = sc.nextInt(); //a=8
            if(a==2){
                System.out.print(1+" ");
                System.out.println(1);
            }else{

            for(int j=a/2; j>=2; j--){
                int num = a-j; //num = 6
                int count=0;
                for(int k=2; k<num; k++){
                    if(num%k==0){
                        count++;
                        break;
                    }
                   
                }
                for(int k=2; k<j; k++){
                    if(j%k==0){
                        count++;
                        break;
                    }
                   
                }
                
                if(count==0){
                    if(j<num){
                        System.out.print(j+" ");
                        System.out.println(num);
                        break;
                    }else{
                        System.out.print(num+" ");
                        System.out.println(j);
                        break;
                    }
                    }
                    
                }
            }
              
            }
            sc.close();
        }
    }

