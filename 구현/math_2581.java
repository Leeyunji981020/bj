import java.util.*;
public class math_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum=0;
        for(int i=min; i<=max; i++){
            if(i==1) continue;
            int count=0;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr.add(i);
                sum+=i;
               
            }
        }
        if(arr.size()==0){
            System.out.println(-1);
        }else{
            
            // for(int i=0; i<arr.size(); i++){
            //     if(arr.get(i)!=1){
            //         sum+=arr.get(i);
            //     }
            // }
            System.out.println(sum);
            if(arr.get(0)==1){
                System.out.println(arr.get(1));
            }else{

                System.out.println(arr.get(0));
            }
        }




        sc.close();
    }
}
