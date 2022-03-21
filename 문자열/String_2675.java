import java.util.*;
public class String_2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //정답 출력
       // String answer ="";

        for(int i=0; i<num; i++){
            // 3 ABC 이렇게 받고 싶으면 밑에처럼 하면 됨
            // 굳이 split 쓸 필요 X;
            int a = sc.nextInt();
            String word = sc.next();
            
            //int a =  (int)word.charAt(0)-'0';
                //System.out.println(word2[1]);
           for(int j=0; j<word.length(); j++){
               for(int q=0; q<a; q++){
                  System.out.print(word.charAt(j));
               }
           }
System.out.println();

        }



        sc.close();
    }
    
}
