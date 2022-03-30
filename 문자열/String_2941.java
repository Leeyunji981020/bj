import java.util.*;
public class String_2941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String arr[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0; i<arr.length; i++){
            if(A.contains(arr[i])){
                A = A.replace(arr[i],".");
            }
        }
        System.out.println(A.length());
    }
    
}
