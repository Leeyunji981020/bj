import java.util.*;
public class String_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int answer=0;
        for(int i=0; i<num; i++){
            String word = sc.next();
            Character[] arr = new Character[word.length()];
            for(int j=0; j<word.length(); j++){
                arr[j] = word.charAt(j);
            }
            int count=0;


            for(int j=0; j<arr.length-1; j++){
                if(arr[j]!=arr[j+1]){
                    for(int k=j+1; k<arr.length-1; k++){
                        if(arr[j]==arr[k+1]){
                            count++;
                        }
                    }
                }
            }
            
            if(count==0){
                answer++;
            }
            
            
        }
        System.out.println(answer);

        sc.close();
    }
}
