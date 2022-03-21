import java.util.*;
public class String_10809 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next().toUpperCase();

        int[] alpha = new int[27];
        for(int i=1; i<27; i++){
            alpha[i] = -1;
        }


        for(int i=0; i<a.length(); i++){
            int num = (int)a.charAt(i)-64; //알파벳을 숫자로 바꾸기
            if(alpha[num]==-1){

                alpha[num] = i;
            }
           //System.out.println(num);
        }

        for(int i=1; i<27; i++){
            System.out.println(alpha[i]);
        }

        // 엄청 쉬운 방법
        // for(char i= 'a'; i<= 'z'; i++){
           // System.out.print();
        
        scanner.close();
    }
    
}
